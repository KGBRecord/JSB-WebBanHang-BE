package com.jsb.dto.client;

import lombok.Data;

import java.time.Instant;

import com.jsb.entity.reward.RewardType;

@Data
public class ClientRewardLogResponse {
    private Long rewardLogId;
    private Instant rewardLogCreatedAt;
    private Integer rewardLogScore;
    private RewardType rewardLogType;
    private String rewardLogNote;
}
