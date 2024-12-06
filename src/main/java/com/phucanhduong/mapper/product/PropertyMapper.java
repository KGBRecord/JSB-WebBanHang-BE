package com.phucanhduong.mapper.product;

import com.phucanhduong.dto.product.PropertyRequest;
import com.phucanhduong.dto.product.PropertyResponse;
import com.phucanhduong.entity.product.Property;
import com.phucanhduong.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PropertyMapper extends GenericMapper<Property, PropertyRequest, PropertyResponse> {
}
