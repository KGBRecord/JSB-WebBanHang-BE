package com.jsb.mapper.customer;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.jsb.dto.customer.CustomerResourceRequest;
import com.jsb.dto.customer.CustomerResourceResponse;
import com.jsb.entity.customer.CustomerResource;
import com.jsb.mapper.GenericMapper;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerResourceMapper extends GenericMapper<CustomerResource, CustomerResourceRequest, CustomerResourceResponse> {
}
