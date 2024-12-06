package com.phucanhduong.mapper.product;

import com.phucanhduong.dto.inventory.ProductInventoryResponse;
import com.phucanhduong.projection.inventory.ProductInventory;
import com.phucanhduong.mapper.inventory.DocketVariantMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,
        uses = {DocketVariantMapper.class, BrandMapper.class, SupplierMapper.class})
public interface ProductInventoryMapper {

    ProductInventoryResponse toResponse(ProductInventory productInventory);

    List<ProductInventoryResponse> toResponse(List<ProductInventory> productInventory);

}
