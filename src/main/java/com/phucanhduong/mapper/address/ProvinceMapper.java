package com.phucanhduong.mapper.address;

import com.phucanhduong.dto.address.ProvinceRequest;
import com.phucanhduong.dto.address.ProvinceResponse;
import com.phucanhduong.entity.address.Province;
import com.phucanhduong.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProvinceMapper extends GenericMapper<Province, ProvinceRequest, ProvinceResponse> {
}
