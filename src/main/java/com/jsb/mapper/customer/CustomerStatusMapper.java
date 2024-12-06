package com.jsb.mapper.customer;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.jsb.dto.customer.CustomerStatusRequest;
import com.jsb.dto.customer.CustomerStatusResponse;
import com.jsb.entity.customer.CustomerStatus;
import com.jsb.mapper.GenericMapper;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerStatusMapper extends GenericMapper<CustomerStatus, CustomerStatusRequest, CustomerStatusResponse> {
}
