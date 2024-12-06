package com.phucanhduong.mapper.employee;

import com.phucanhduong.dto.employee.JobTitleRequest;
import com.phucanhduong.dto.employee.JobTitleResponse;
import com.phucanhduong.entity.employee.JobTitle;
import com.phucanhduong.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface JobTitleMapper extends GenericMapper<JobTitle, JobTitleRequest, JobTitleResponse> {
}
