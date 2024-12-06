package com.jsb.mapper.product;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.jsb.dto.product.VariantRequest;
import com.jsb.dto.product.VariantResponse;
import com.jsb.entity.product.Variant;
import com.jsb.mapper.GenericMapper;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface VariantMapper extends GenericMapper<Variant, VariantRequest, VariantResponse> {
}
