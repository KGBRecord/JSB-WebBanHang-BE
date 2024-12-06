package com.jsb.mapper.inventory;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

import com.jsb.dto.inventory.CountRequest;
import com.jsb.dto.inventory.CountResponse;
import com.jsb.entity.inventory.Count;
import com.jsb.mapper.GenericMapper;
import com.jsb.utils.MapperUtils;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,
        uses = {MapperUtils.class, WarehouseMapper.class, CountVariantMapper.class})
public interface CountMapper extends GenericMapper<Count, CountRequest, CountResponse> {

    @Override
    @BeanMapping(qualifiedByName = "attachCount")
    @Mapping(source = "warehouseId", target = "warehouse")
    Count requestToEntity(CountRequest request);

    @Override
    @BeanMapping(qualifiedByName = "attachCount")
    @Mapping(source = "warehouseId", target = "warehouse")
    Count partialUpdate(@MappingTarget Count entity, CountRequest request);

}
