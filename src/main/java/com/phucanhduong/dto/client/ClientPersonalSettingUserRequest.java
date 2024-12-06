package com.phucanhduong.dto.client;

import com.phucanhduong.dto.address.AddressRequest;
import lombok.Data;

@Data
public class ClientPersonalSettingUserRequest {
    private String username;
    private String fullname;
    private String gender;
    private AddressRequest address;
}
