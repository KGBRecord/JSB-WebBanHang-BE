package com.phucanhduong.mapper.inventory;

import com.phucanhduong.dto.inventory.DocketVariantEliminatedResponse;
import com.phucanhduong.dto.inventory.DocketVariantExtendedResponse;
import com.phucanhduong.dto.inventory.DocketVariantRequest;
import com.phucanhduong.dto.inventory.DocketVariantResponse;
import com.phucanhduong.entity.inventory.DocketVariant;
import com.phucanhduong.mapper.GenericMapper;
import com.phucanhduong.utils.MapperUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,
        uses = {DocketReasonMapper.class, WarehouseMapper.class, MapperUtils.class})
public interface DocketVariantMapper extends GenericMapper<DocketVariant, DocketVariantRequest, DocketVariantResponse> {

    @Override
    @Mapping(source = "variantId", target = "variant")
    DocketVariant requestToEntity(DocketVariantRequest request);

    @Override
    @Mapping(source = "variantId", target = "variant")
    DocketVariant partialUpdate(@MappingTarget DocketVariant entity, DocketVariantRequest request);

    DocketVariantExtendedResponse docketVariantToDocketVariantExtendedResponse(DocketVariant docketVariant);

    DocketVariantEliminatedResponse docketVariantToDocketVariantEliminatedResponse(DocketVariant docketVariant);

}
