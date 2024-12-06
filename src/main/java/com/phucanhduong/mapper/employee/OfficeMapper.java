package com.phucanhduong.mapper.employee;

import com.phucanhduong.dto.employee.OfficeRequest;
import com.phucanhduong.dto.employee.OfficeResponse;
import com.phucanhduong.entity.employee.Office;
import com.phucanhduong.mapper.GenericMapper;
import com.phucanhduong.mapper.address.AddressMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = AddressMapper.class)
public interface OfficeMapper extends GenericMapper<Office, OfficeRequest, OfficeResponse> {
}
