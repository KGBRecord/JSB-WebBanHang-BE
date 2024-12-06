package com.phucanhduong.mapper.product;

import com.phucanhduong.dto.product.TagRequest;
import com.phucanhduong.dto.product.TagResponse;
import com.phucanhduong.entity.product.Tag;
import com.phucanhduong.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TagMapper extends GenericMapper<Tag, TagRequest, TagResponse> {
}
