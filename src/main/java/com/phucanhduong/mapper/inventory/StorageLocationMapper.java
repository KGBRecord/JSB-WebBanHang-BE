package com.phucanhduong.mapper.inventory;

import com.phucanhduong.dto.inventory.StorageLocationRequest;
import com.phucanhduong.dto.inventory.StorageLocationResponse;
import com.phucanhduong.entity.inventory.StorageLocation;
import com.phucanhduong.mapper.GenericMapper;
import com.phucanhduong.mapper.product.VariantMapper;
import com.phucanhduong.utils.MapperUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,
        uses = {MapperUtils.class, WarehouseMapper.class, VariantMapper.class})
public interface StorageLocationMapper extends GenericMapper<StorageLocation, StorageLocationRequest, StorageLocationResponse> {

    @Override
    @Mapping(source = "warehouseId", target = "warehouse")
    @Mapping(source = "variantId", target = "variant")
    StorageLocation requestToEntity(StorageLocationRequest request);

    @Override
    @Mapping(source = "warehouseId", target = "warehouse")
    @Mapping(source = "variantId", target = "variant")
    StorageLocation partialUpdate(@MappingTarget StorageLocation entity, StorageLocationRequest request);

}
