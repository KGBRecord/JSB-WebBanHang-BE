package com.jsb.mapper.order;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.jsb.dto.order.OrderCancellationReasonRequest;
import com.jsb.dto.order.OrderCancellationReasonResponse;
import com.jsb.entity.order.OrderCancellationReason;
import com.jsb.mapper.GenericMapper;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface OrderCancellationReasonMapper extends GenericMapper<OrderCancellationReason, OrderCancellationReasonRequest,
        OrderCancellationReasonResponse> {}
