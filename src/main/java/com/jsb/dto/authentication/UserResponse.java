package com.jsb.dto.authentication;

import lombok.Data;

import java.time.Instant;
import java.util.Set;

import com.jsb.dto.address.AddressResponse;

@Data
public class UserResponse {
    private Long id;
    private Instant createdAt;
    private Instant updatedAt;
    private String username;
    private String fullname;
    private String email;
    private String phone;
    private String gender;
    private AddressResponse address;
    private String avatar;
    private Integer status;
    private Set<RoleResponse> roles;
}
