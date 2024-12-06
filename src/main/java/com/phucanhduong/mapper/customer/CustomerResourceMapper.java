package com.phucanhduong.mapper.customer;

import com.phucanhduong.dto.customer.CustomerResourceRequest;
import com.phucanhduong.dto.customer.CustomerResourceResponse;
import com.phucanhduong.entity.customer.CustomerResource;
import com.phucanhduong.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerResourceMapper extends GenericMapper<CustomerResource, CustomerResourceRequest, CustomerResourceResponse> {
}
