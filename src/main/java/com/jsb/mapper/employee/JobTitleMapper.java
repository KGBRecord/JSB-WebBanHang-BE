package com.jsb.mapper.employee;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.jsb.dto.employee.JobTitleRequest;
import com.jsb.dto.employee.JobTitleResponse;
import com.jsb.entity.employee.JobTitle;
import com.jsb.mapper.GenericMapper;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface JobTitleMapper extends GenericMapper<JobTitle, JobTitleRequest, JobTitleResponse> {
}
