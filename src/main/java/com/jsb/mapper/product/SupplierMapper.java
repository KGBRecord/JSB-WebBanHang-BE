package com.jsb.mapper.product;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.jsb.dto.product.SupplierRequest;
import com.jsb.dto.product.SupplierResponse;
import com.jsb.entity.product.Supplier;
import com.jsb.mapper.GenericMapper;
import com.jsb.mapper.address.AddressMapper;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = AddressMapper.class)
public interface SupplierMapper extends GenericMapper<Supplier, SupplierRequest, SupplierResponse> {
}
