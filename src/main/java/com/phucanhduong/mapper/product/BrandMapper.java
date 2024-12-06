package com.phucanhduong.mapper.product;

import com.phucanhduong.dto.product.BrandRequest;
import com.phucanhduong.dto.product.BrandResponse;
import com.phucanhduong.entity.product.Brand;
import com.phucanhduong.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BrandMapper extends GenericMapper<Brand, BrandRequest, BrandResponse> {}
