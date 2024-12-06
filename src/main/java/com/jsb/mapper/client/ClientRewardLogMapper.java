package com.jsb.mapper.client;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import com.jsb.dto.client.ClientRewardLogResponse;
import com.jsb.entity.reward.RewardLog;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ClientRewardLogMapper {

    @Mapping(source = "id", target = "rewardLogId")
    @Mapping(source = "createdAt", target = "rewardLogCreatedAt")
    @Mapping(source = "score", target = "rewardLogScore")
    @Mapping(source = "type", target = "rewardLogType")
    @Mapping(source = "note", target = "rewardLogNote")
    ClientRewardLogResponse entityToResponse(RewardLog rewardLog);

    List<ClientRewardLogResponse> entityToResponse(List<RewardLog> rewardLogs);

}
