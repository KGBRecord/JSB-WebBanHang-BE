package com.phucanhduong.mapper.product;

import com.phucanhduong.dto.inventory.VariantInventoryResponse;
import com.phucanhduong.projection.inventory.VariantInventory;
import com.phucanhduong.mapper.inventory.DocketVariantMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = DocketVariantMapper.class)
public interface VariantInventoryMapper {

    VariantInventoryResponse toResponse(VariantInventory variantInventory);

    List<VariantInventoryResponse> toResponse(List<VariantInventory> variantInventory);

}
