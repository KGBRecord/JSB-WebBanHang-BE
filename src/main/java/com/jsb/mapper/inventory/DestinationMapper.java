package com.jsb.mapper.inventory;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.jsb.dto.inventory.DestinationRequest;
import com.jsb.dto.inventory.DestinationResponse;
import com.jsb.entity.inventory.Destination;
import com.jsb.mapper.GenericMapper;
import com.jsb.mapper.address.AddressMapper;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = AddressMapper.class)
public interface DestinationMapper extends GenericMapper<Destination, DestinationRequest, DestinationResponse> {}
