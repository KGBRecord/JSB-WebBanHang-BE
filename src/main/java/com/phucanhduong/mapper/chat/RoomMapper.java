package com.phucanhduong.mapper.chat;

import com.phucanhduong.dto.chat.RoomRequest;
import com.phucanhduong.dto.chat.RoomResponse;
import com.phucanhduong.entity.chat.Room;
import com.phucanhduong.mapper.GenericMapper;
import com.phucanhduong.utils.MapperUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = MapperUtils.class)
public interface RoomMapper extends GenericMapper<Room, RoomRequest, RoomResponse> {

    @Override
    @Mapping(source = "userId", target = "user")
    Room requestToEntity(RoomRequest request);

}
