package com.phucanhduong.mapper.order;

import com.phucanhduong.dto.order.OrderCancellationReasonRequest;
import com.phucanhduong.dto.order.OrderCancellationReasonResponse;
import com.phucanhduong.entity.order.OrderCancellationReason;
import com.phucanhduong.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface OrderCancellationReasonMapper extends GenericMapper<OrderCancellationReason, OrderCancellationReasonRequest,
        OrderCancellationReasonResponse> {}
