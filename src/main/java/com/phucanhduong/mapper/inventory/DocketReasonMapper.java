package com.phucanhduong.mapper.inventory;

import com.phucanhduong.dto.inventory.DocketReasonRequest;
import com.phucanhduong.dto.inventory.DocketReasonResponse;
import com.phucanhduong.entity.inventory.DocketReason;
import com.phucanhduong.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DocketReasonMapper extends GenericMapper<DocketReason, DocketReasonRequest, DocketReasonResponse> {}
