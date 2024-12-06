package com.phucanhduong.mapper.employee;

import com.phucanhduong.dto.employee.JobLevelRequest;
import com.phucanhduong.dto.employee.JobLevelResponse;
import com.phucanhduong.entity.employee.JobLevel;
import com.phucanhduong.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface JobLevelMapper extends GenericMapper<JobLevel, JobLevelRequest, JobLevelResponse> {
}
