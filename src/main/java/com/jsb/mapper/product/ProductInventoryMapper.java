package com.jsb.mapper.product;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.jsb.dto.inventory.ProductInventoryResponse;
import com.jsb.mapper.inventory.DocketVariantMapper;
import com.jsb.projection.inventory.ProductInventory;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,
        uses = {DocketVariantMapper.class, BrandMapper.class, SupplierMapper.class})
public interface ProductInventoryMapper {

    ProductInventoryResponse toResponse(ProductInventory productInventory);

    List<ProductInventoryResponse> toResponse(List<ProductInventory> productInventory);

}
