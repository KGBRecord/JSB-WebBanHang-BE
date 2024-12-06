package com.phucanhduong.mapper.employee;

import com.phucanhduong.dto.employee.JobTypeRequest;
import com.phucanhduong.dto.employee.JobTypeResponse;
import com.phucanhduong.entity.employee.JobType;
import com.phucanhduong.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface JobTypeMapper extends GenericMapper<JobType, JobTypeRequest, JobTypeResponse> {
}
