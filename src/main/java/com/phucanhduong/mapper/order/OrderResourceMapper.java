package com.phucanhduong.mapper.order;


import com.phucanhduong.dto.order.OrderResourceRequest;
import com.phucanhduong.dto.order.OrderResourceResponse;
import com.phucanhduong.entity.order.OrderResource;
import com.phucanhduong.mapper.GenericMapper;
import com.phucanhduong.mapper.customer.CustomerResourceMapper;
import com.phucanhduong.utils.MapperUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,
        uses = {MapperUtils.class, CustomerResourceMapper.class})
public interface OrderResourceMapper extends GenericMapper<OrderResource, OrderResourceRequest, OrderResourceResponse> {

    @Override
    @Mapping(source = "customerResourceId", target = "customerResource")
    OrderResource requestToEntity(OrderResourceRequest request);

    @Override
    @Mapping(source = "customerResourceId", target = "customerResource")
    OrderResource partialUpdate(@MappingTarget OrderResource entity, OrderResourceRequest request);

}
