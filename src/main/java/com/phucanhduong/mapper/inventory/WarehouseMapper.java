package com.phucanhduong.mapper.inventory;

import com.phucanhduong.dto.inventory.WarehouseRequest;
import com.phucanhduong.dto.inventory.WarehouseResponse;
import com.phucanhduong.entity.inventory.Warehouse;
import com.phucanhduong.mapper.GenericMapper;
import com.phucanhduong.mapper.address.AddressMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = AddressMapper.class)
public interface WarehouseMapper extends GenericMapper<Warehouse, WarehouseRequest, WarehouseResponse> {}
