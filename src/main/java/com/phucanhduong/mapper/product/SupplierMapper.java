package com.phucanhduong.mapper.product;

import com.phucanhduong.dto.product.SupplierRequest;
import com.phucanhduong.dto.product.SupplierResponse;
import com.phucanhduong.entity.product.Supplier;
import com.phucanhduong.mapper.GenericMapper;
import com.phucanhduong.mapper.address.AddressMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = AddressMapper.class)
public interface SupplierMapper extends GenericMapper<Supplier, SupplierRequest, SupplierResponse> {
}
