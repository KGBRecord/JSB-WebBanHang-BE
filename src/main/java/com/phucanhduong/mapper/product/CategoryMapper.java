package com.phucanhduong.mapper.product;

import com.phucanhduong.dto.product.CategoryRequest;
import com.phucanhduong.dto.product.CategoryResponse;
import com.phucanhduong.entity.product.Category;
import com.phucanhduong.mapper.GenericMapper;
import com.phucanhduong.utils.MapperUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = MapperUtils.class)
public interface CategoryMapper extends GenericMapper<Category, CategoryRequest, CategoryResponse> {

    @Override
    @Mapping(source = "parentCategoryId", target = "parentCategory")
    Category requestToEntity(CategoryRequest request);

    @Override
    @Mapping(source = "parentCategoryId", target = "parentCategory")
    Category partialUpdate(@MappingTarget Category entity, CategoryRequest request);

}
