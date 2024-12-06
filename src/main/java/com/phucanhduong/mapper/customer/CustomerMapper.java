package com.phucanhduong.mapper.customer;

import com.phucanhduong.dto.customer.CustomerRequest;
import com.phucanhduong.dto.customer.CustomerResponse;
import com.phucanhduong.entity.customer.Customer;
import com.phucanhduong.mapper.GenericMapper;
import com.phucanhduong.mapper.authentication.UserMapper;
import com.phucanhduong.utils.MapperUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {MapperUtils.class, UserMapper.class})
public interface CustomerMapper extends GenericMapper<Customer, CustomerRequest, CustomerResponse> {

    @Override
    @Mapping(source = "customerGroupId", target = "customerGroup")
    @Mapping(source = "customerResourceId", target = "customerResource")
    @Mapping(source = "customerStatusId", target = "customerStatus")
    Customer requestToEntity(CustomerRequest request);

    @Override
    @Mapping(source = "customerGroupId", target = "customerGroup")
    @Mapping(source = "customerResourceId", target = "customerResource")
    @Mapping(source = "customerStatusId", target = "customerStatus")
    Customer partialUpdate(@MappingTarget Customer entity, CustomerRequest request);

}
