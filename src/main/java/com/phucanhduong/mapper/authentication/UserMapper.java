package com.phucanhduong.mapper.authentication;

import com.phucanhduong.dto.authentication.UserRequest;
import com.phucanhduong.dto.authentication.UserResponse;
import com.phucanhduong.dto.client.ClientEmailSettingUserRequest;
import com.phucanhduong.dto.client.ClientPersonalSettingUserRequest;
import com.phucanhduong.dto.client.ClientPhoneSettingUserRequest;
import com.phucanhduong.entity.authentication.User;
import com.phucanhduong.mapper.GenericMapper;
import com.phucanhduong.mapper.address.AddressMapper;
import com.phucanhduong.utils.MapperUtils;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {MapperUtils.class, AddressMapper.class})
public interface UserMapper extends GenericMapper<User, UserRequest, UserResponse> {

    @Override
    @BeanMapping(qualifiedByName = "attachUser")
    @Mapping(source = "password", target = "password", qualifiedByName = "hashPassword")
    User requestToEntity(UserRequest request);

    @Override
    @BeanMapping(qualifiedByName = "attachUser")
    @Mapping(source = "password", target = "password", qualifiedByName = "hashPassword",
            nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    User partialUpdate(@MappingTarget User entity, UserRequest request);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    User partialUpdate(@MappingTarget User entity, ClientPersonalSettingUserRequest request);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    User partialUpdate(@MappingTarget User entity, ClientPhoneSettingUserRequest request);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    User partialUpdate(@MappingTarget User entity, ClientEmailSettingUserRequest request);

}
