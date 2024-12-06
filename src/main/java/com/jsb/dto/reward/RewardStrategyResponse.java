package com.jsb.dto.reward;

import lombok.Data;

import java.time.Instant;

import com.jsb.entity.reward.RewardType;

@Data
public class RewardStrategyResponse {
    private Long id;
    private Instant createdAt;
    private Instant updatedAt;
    private String name;
    private RewardType code;
    private String formula;
    private Integer status;
}
