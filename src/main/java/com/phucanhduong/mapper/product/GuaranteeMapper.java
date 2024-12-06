package com.phucanhduong.mapper.product;

import com.phucanhduong.dto.product.GuaranteeRequest;
import com.phucanhduong.dto.product.GuaranteeResponse;
import com.phucanhduong.entity.product.Guarantee;
import com.phucanhduong.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface GuaranteeMapper extends GenericMapper<Guarantee, GuaranteeRequest, GuaranteeResponse> {
}
