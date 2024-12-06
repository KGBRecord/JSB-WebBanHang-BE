package com.jsb.mapper.employee;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.jsb.dto.employee.OfficeRequest;
import com.jsb.dto.employee.OfficeResponse;
import com.jsb.entity.employee.Office;
import com.jsb.mapper.GenericMapper;
import com.jsb.mapper.address.AddressMapper;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = AddressMapper.class)
public interface OfficeMapper extends GenericMapper<Office, OfficeRequest, OfficeResponse> {
}
