package com.jsb.dto.client;

import com.jsb.dto.address.AddressRequest;

import lombok.Data;

@Data
public class ClientPersonalSettingUserRequest {
    private String username;
    private String fullname;
    private String gender;
    private AddressRequest address;
}
