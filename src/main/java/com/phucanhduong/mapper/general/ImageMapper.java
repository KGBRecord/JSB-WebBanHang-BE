package com.phucanhduong.mapper.general;

import com.phucanhduong.dto.general.ImageRequest;
import com.phucanhduong.dto.general.ImageResponse;
import com.phucanhduong.entity.general.Image;
import com.phucanhduong.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ImageMapper extends GenericMapper<Image, ImageRequest, ImageResponse> {}
