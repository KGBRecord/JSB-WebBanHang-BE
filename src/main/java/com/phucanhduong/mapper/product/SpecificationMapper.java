package com.phucanhduong.mapper.product;

import com.phucanhduong.dto.product.SpecificationRequest;
import com.phucanhduong.dto.product.SpecificationResponse;
import com.phucanhduong.entity.product.Specification;
import com.phucanhduong.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SpecificationMapper extends GenericMapper<Specification, SpecificationRequest, SpecificationResponse> {
}
