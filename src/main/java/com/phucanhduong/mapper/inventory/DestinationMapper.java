package com.phucanhduong.mapper.inventory;

import com.phucanhduong.dto.inventory.DestinationRequest;
import com.phucanhduong.dto.inventory.DestinationResponse;
import com.phucanhduong.entity.inventory.Destination;
import com.phucanhduong.mapper.GenericMapper;
import com.phucanhduong.mapper.address.AddressMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = AddressMapper.class)
public interface DestinationMapper extends GenericMapper<Destination, DestinationRequest, DestinationResponse> {}
