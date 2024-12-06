package com.jsb.mapper.inventory;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

import com.jsb.dto.inventory.PurchaseOrderVariantRequest;
import com.jsb.dto.inventory.PurchaseOrderVariantResponse;
import com.jsb.entity.inventory.PurchaseOrderVariant;
import com.jsb.mapper.GenericMapper;
import com.jsb.utils.MapperUtils;

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
