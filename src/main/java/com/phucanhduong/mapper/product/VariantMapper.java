package com.phucanhduong.mapper.product;

import com.phucanhduong.dto.product.VariantRequest;
import com.phucanhduong.dto.product.VariantResponse;
import com.phucanhduong.entity.product.Variant;
import com.phucanhduong.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface VariantMapper extends GenericMapper<Variant, VariantRequest, VariantResponse> {
}
