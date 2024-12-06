package com.phucanhduong.mapper.customer;

import com.phucanhduong.dto.customer.CustomerGroupRequest;
import com.phucanhduong.dto.customer.CustomerGroupResponse;
import com.phucanhduong.entity.customer.CustomerGroup;
import com.phucanhduong.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerGroupMapper extends GenericMapper<CustomerGroup, CustomerGroupRequest, CustomerGroupResponse> {
}
