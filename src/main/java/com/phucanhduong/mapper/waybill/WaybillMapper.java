package com.phucanhduong.mapper.waybill;

import com.phucanhduong.dto.waybill.WaybillRequest;
import com.phucanhduong.dto.waybill.WaybillResponse;
import com.phucanhduong.entity.waybill.Waybill;
import com.phucanhduong.mapper.GenericMapper;
import com.phucanhduong.mapper.order.OrderMapper;
import com.phucanhduong.utils.MapperUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {MapperUtils.class, OrderMapper.class})
public interface WaybillMapper extends GenericMapper<Waybill, WaybillRequest, WaybillResponse> {

    @Override
    @Mapping(source = "orderId", target = "order")
    Waybill requestToEntity(WaybillRequest request);

    @Override
    @Mapping(source = "orderId", target = "order")
    Waybill partialUpdate(@MappingTarget Waybill entity, WaybillRequest request);

}
