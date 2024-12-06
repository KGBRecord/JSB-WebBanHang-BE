package com.jsb.dto.authentication;

import lombok.Data;

import java.util.Set;

import com.jsb.dto.address.AddressRequest;

@Data
public class UserRequest {
    private String username;
    private String password;
    private String fullname;
    private String email;
    private String phone;
    private String gender;
    private AddressRequest address;
    private String avatar;
    private Integer status;
    private Set<Role_UserRequest> roles;
}
