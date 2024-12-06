package com.jsb.mapper.product;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.jsb.dto.product.GuaranteeRequest;
import com.jsb.dto.product.GuaranteeResponse;
import com.jsb.entity.product.Guarantee;
import com.jsb.mapper.GenericMapper;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface GuaranteeMapper extends GenericMapper<Guarantee, GuaranteeRequest, GuaranteeResponse> {
}
