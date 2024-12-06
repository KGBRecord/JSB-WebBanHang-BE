package com.jsb.mapper.address;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.jsb.dto.address.ProvinceRequest;
import com.jsb.dto.address.ProvinceResponse;
import com.jsb.entity.address.Province;
import com.jsb.mapper.GenericMapper;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProvinceMapper extends GenericMapper<Province, ProvinceRequest, ProvinceResponse> {
}
