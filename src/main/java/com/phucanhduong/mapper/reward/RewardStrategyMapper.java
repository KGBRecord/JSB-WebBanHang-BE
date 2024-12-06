package com.phucanhduong.mapper.reward;

import com.phucanhduong.dto.reward.RewardStrategyRequest;
import com.phucanhduong.dto.reward.RewardStrategyResponse;
import com.phucanhduong.entity.reward.RewardStrategy;
import com.phucanhduong.mapper.GenericMapper;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RewardStrategyMapper extends GenericMapper<RewardStrategy, RewardStrategyRequest, RewardStrategyResponse> {

    @Override
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    RewardStrategy partialUpdate(@MappingTarget RewardStrategy entity, RewardStrategyRequest request);

}
