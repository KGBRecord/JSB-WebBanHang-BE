package com.phucanhduong.mapper.inventory;

import com.phucanhduong.dto.inventory.VariantInventoryLimitRequest;
import com.phucanhduong.dto.inventory.VariantInventoryLimitResponse;
import com.phucanhduong.entity.inventory.VariantInventoryLimit;
import com.phucanhduong.mapper.GenericMapper;
import com.phucanhduong.utils.MapperUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = MapperUtils.class)
public interface VariantInventoryLimitMapper extends GenericMapper<VariantInventoryLimit, VariantInventoryLimitRequest,
        VariantInventoryLimitResponse> {

    @Override
    @Mapping(source = "variantId", target = "variant")
    VariantInventoryLimit requestToEntity(VariantInventoryLimitRequest request);

    @Override
    @Mapping(source = "variantId", target = "variant")
    VariantInventoryLimit partialUpdate(@MappingTarget VariantInventoryLimit entity, VariantInventoryLimitRequest request);

}
