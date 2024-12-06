package com.phucanhduong.mapper.inventory;

import com.phucanhduong.dto.inventory.PurchaseOrderVariantRequest;
import com.phucanhduong.dto.inventory.PurchaseOrderVariantResponse;
import com.phucanhduong.entity.inventory.PurchaseOrderVariant;
import com.phucanhduong.mapper.GenericMapper;
import com.phucanhduong.utils.MapperUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = MapperUtils.class)
public interface PurchaseOrderVariantMapper extends GenericMapper<PurchaseOrderVariant, PurchaseOrderVariantRequest,
        PurchaseOrderVariantResponse> {

    @Override
    @Mapping(source = "variantId", target = "variant")
    PurchaseOrderVariant requestToEntity(PurchaseOrderVariantRequest request);

    @Override
    @Mapping(source = "variantId", target = "variant")
    PurchaseOrderVariant partialUpdate(@MappingTarget PurchaseOrderVariant entity, PurchaseOrderVariantRequest request);

}
