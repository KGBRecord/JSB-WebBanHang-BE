package com.jsb.mapper.product;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.jsb.dto.product.PropertyRequest;
import com.jsb.dto.product.PropertyResponse;
import com.jsb.entity.product.Property;
import com.jsb.mapper.GenericMapper;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PropertyMapper extends GenericMapper<Property, PropertyRequest, PropertyResponse> {
}
