package com.phucanhduong.mapper.inventory;

import com.phucanhduong.dto.inventory.TransferRequest;
import com.phucanhduong.dto.inventory.TransferResponse;
import com.phucanhduong.entity.inventory.Transfer;
import com.phucanhduong.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = DocketMapper.class)
public interface TransferMapper extends GenericMapper<Transfer, TransferRequest, TransferResponse> {}
