package com.phucanhduong.mapper.promotion;

import com.phucanhduong.dto.client.ClientPromotionResponse;
import com.phucanhduong.dto.promotion.PromotionRequest;
import com.phucanhduong.dto.promotion.PromotionResponse;
import com.phucanhduong.entity.product.Category;
import com.phucanhduong.entity.product.Product;
import com.phucanhduong.entity.promotion.Promotion;
import com.phucanhduong.mapper.GenericMapper;
import com.phucanhduong.mapper.product.ProductMapper;
import com.phucanhduong.repository.product.CategoryRepository;
import com.phucanhduong.utils.MapperUtils;
import org.mapstruct.AfterMapping;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,
        uses = {MapperUtils.class, ProductMapper.class})
public abstract class PromotionMapper implements GenericMapper<Promotion, PromotionRequest, PromotionResponse> {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    @BeanMapping(qualifiedByName = "addProductsFromCategories")
    @Mapping(source = "productIds", target = "products")
    public abstract Promotion requestToEntity(PromotionRequest request);

    @Override
    @Mapping(source = "productIds", target = "products")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    public abstract Promotion partialUpdate(@MappingTarget Promotion entity, PromotionRequest request);

    @AfterMapping
    @Named("addProductsFromCategories")
    protected void addProductsFromCategories(@MappingTarget Promotion promotion, PromotionRequest request) {
        if (request.getCategoryIds().size() != 0) {
            Set<Product> productsFromCategories = request.getCategoryIds().stream()
                    .map(categoryRepository::getById)
                    .map(Category::getProducts)
                    .flatMap(List::stream)
                    .collect(Collectors.toSet());

            promotion.setProducts(productsFromCategories);
        }
    }

    @Mapping(source = "id", target = "promotionId")
    @Mapping(source = "percent", target = "promotionPercent")
    public abstract ClientPromotionResponse entityToClientResponse(Promotion promotion);

}
