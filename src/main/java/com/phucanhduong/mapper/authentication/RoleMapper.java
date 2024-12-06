package com.phucanhduong.mapper.authentication;

import com.phucanhduong.dto.authentication.RoleRequest;
import com.phucanhduong.dto.authentication.RoleResponse;
import com.phucanhduong.entity.authentication.Role;
import com.phucanhduong.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RoleMapper extends GenericMapper<Role, RoleRequest, RoleResponse> {
}
