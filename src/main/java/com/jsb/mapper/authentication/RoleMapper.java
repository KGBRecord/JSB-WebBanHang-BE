package com.jsb.mapper.authentication;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.jsb.dto.authentication.RoleRequest;
import com.jsb.dto.authentication.RoleResponse;
import com.jsb.entity.authentication.Role;
import com.jsb.mapper.GenericMapper;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RoleMapper extends GenericMapper<Role, RoleRequest, RoleResponse> {
}
