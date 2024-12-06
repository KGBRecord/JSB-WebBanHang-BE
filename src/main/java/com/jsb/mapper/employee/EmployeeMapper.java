package com.jsb.mapper.employee;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

import com.jsb.dto.employee.EmployeeRequest;
import com.jsb.dto.employee.EmployeeResponse;
import com.jsb.entity.employee.Employee;
import com.jsb.mapper.GenericMapper;
import com.jsb.mapper.authentication.UserMapper;
import com.jsb.utils.MapperUtils;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {MapperUtils.class, UserMapper.class})
public interface EmployeeMapper extends GenericMapper<Employee, EmployeeRequest, EmployeeResponse> {

    @Override
    @Mapping(source = "officeId", target = "office")
    @Mapping(source = "departmentId", target = "department")
    @Mapping(source = "jobTypeId", target = "jobType")
    @Mapping(source = "jobLevelId", target = "jobLevel")
    @Mapping(source = "jobTitleId", target = "jobTitle")
    Employee requestToEntity(EmployeeRequest request);

    @Override
    @Mapping(source = "officeId", target = "office")
    @Mapping(source = "departmentId", target = "department")
    @Mapping(source = "jobTypeId", target = "jobType")
    @Mapping(source = "jobLevelId", target = "jobLevel")
    @Mapping(source = "jobTitleId", target = "jobTitle")
    Employee partialUpdate(@MappingTarget Employee entity, EmployeeRequest request);

}
