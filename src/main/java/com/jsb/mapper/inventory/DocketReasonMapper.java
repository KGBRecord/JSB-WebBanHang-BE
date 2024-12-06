package com.jsb.mapper.inventory;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.jsb.dto.inventory.DocketReasonRequest;
import com.jsb.dto.inventory.DocketReasonResponse;
import com.jsb.entity.inventory.DocketReason;
import com.jsb.mapper.GenericMapper;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DocketReasonMapper extends GenericMapper<DocketReason, DocketReasonRequest, DocketReasonResponse> {}
