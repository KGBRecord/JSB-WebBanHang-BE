package com.phucanhduong.mapper.customer;

import com.phucanhduong.dto.customer.CustomerStatusRequest;
import com.phucanhduong.dto.customer.CustomerStatusResponse;
import com.phucanhduong.entity.customer.CustomerStatus;
import com.phucanhduong.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerStatusMapper extends GenericMapper<CustomerStatus, CustomerStatusRequest, CustomerStatusResponse> {
}
