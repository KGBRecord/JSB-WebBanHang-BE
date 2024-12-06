package com.phucanhduong.mapper.product;

import com.phucanhduong.dto.product.UnitRequest;
import com.phucanhduong.dto.product.UnitResponse;
import com.phucanhduong.entity.product.Unit;
import com.phucanhduong.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UnitMapper extends GenericMapper<Unit, UnitRequest, UnitResponse> {
}
