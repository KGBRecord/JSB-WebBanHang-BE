package com.phucanhduong.mapper.employee;

import com.phucanhduong.dto.employee.DepartmentRequest;
import com.phucanhduong.dto.employee.DepartmentResponse;
import com.phucanhduong.entity.employee.Department;
import com.phucanhduong.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DepartmentMapper extends GenericMapper<Department, DepartmentRequest, DepartmentResponse> {
}
