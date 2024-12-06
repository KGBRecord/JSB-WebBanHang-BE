package com.jsb.mapper.inventory;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.jsb.dto.inventory.WarehouseRequest;
import com.jsb.dto.inventory.WarehouseResponse;
import com.jsb.entity.inventory.Warehouse;
import com.jsb.mapper.GenericMapper;
import com.jsb.mapper.address.AddressMapper;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = AddressMapper.class)
public interface WarehouseMapper extends GenericMapper<Warehouse, WarehouseRequest, WarehouseResponse> {}
