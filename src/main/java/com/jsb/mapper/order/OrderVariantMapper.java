package com.jsb.mapper.order;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

import com.jsb.dto.order.OrderVariantRequest;
import com.jsb.dto.order.OrderVariantResponse;
import com.jsb.entity.order.OrderVariant;
import com.jsb.mapper.GenericMapper;
import com.jsb.utils.MapperUtils;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = MapperUtils.class)
public interface OrderVariantMapper extends GenericMapper<OrderVariant, OrderVariantRequest, OrderVariantResponse> {

    @Override
    @Mapping(source = "variantId", target = "variant")
    OrderVariant requestToEntity(OrderVariantRequest request);

    @Override
    @Mapping(source = "variantId", target = "variant")
    OrderVariant partialUpdate(@MappingTarget OrderVariant entity, OrderVariantRequest request);

}
