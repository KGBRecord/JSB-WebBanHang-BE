package com.jsb.mapper.address;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

import com.jsb.dto.address.DistrictRequest;
import com.jsb.dto.address.DistrictResponse;
import com.jsb.entity.address.District;
import com.jsb.mapper.GenericMapper;
import com.jsb.utils.MapperUtils;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = MapperUtils.class)
public interface DistrictMapper extends GenericMapper<District, DistrictRequest, DistrictResponse> {

    @Override
    @Mapping(source = "provinceId", target = "province")
    District requestToEntity(DistrictRequest request);

    @Override
    @Mapping(source = "provinceId", target = "province")
    District partialUpdate(@MappingTarget District entity, DistrictRequest request);

}
