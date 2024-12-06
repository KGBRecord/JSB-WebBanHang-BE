package com.jsb.mapper.employee;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.jsb.dto.employee.JobLevelRequest;
import com.jsb.dto.employee.JobLevelResponse;
import com.jsb.entity.employee.JobLevel;
import com.jsb.mapper.GenericMapper;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface JobLevelMapper extends GenericMapper<JobLevel, JobLevelRequest, JobLevelResponse> {
}
