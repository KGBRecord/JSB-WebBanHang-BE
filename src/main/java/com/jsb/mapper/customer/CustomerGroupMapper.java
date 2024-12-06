package com.jsb.mapper.customer;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.jsb.dto.customer.CustomerGroupRequest;
import com.jsb.dto.customer.CustomerGroupResponse;
import com.jsb.entity.customer.CustomerGroup;
import com.jsb.mapper.GenericMapper;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerGroupMapper extends GenericMapper<CustomerGroup, CustomerGroupRequest, CustomerGroupResponse> {
}
