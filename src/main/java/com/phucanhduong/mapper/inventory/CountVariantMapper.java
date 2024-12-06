package com.phucanhduong.mapper.inventory;

import com.phucanhduong.dto.inventory.CountVariantRequest;
import com.phucanhduong.dto.inventory.CountVariantResponse;
import com.phucanhduong.entity.inventory.CountVariant;
import com.phucanhduong.mapper.GenericMapper;
import com.phucanhduong.utils.MapperUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = MapperUtils.class)
public interface CountVariantMapper extends GenericMapper<CountVariant, CountVariantRequest, CountVariantResponse> {

    @Override
    @Mapping(source = "variantId", target = "variant")
    CountVariant requestToEntity(CountVariantRequest request);

    @Override
    @Mapping(source = "variantId", target = "variant")
    CountVariant partialUpdate(@MappingTarget CountVariant entity, CountVariantRequest request);

}
