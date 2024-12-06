package com.jsb.dto.inventory;

import lombok.Data;
import org.springframework.lang.Nullable;

import com.jsb.dto.address.AddressRequest;

@Data
public class DestinationRequest {
    @Nullable
    private String contactFullname;
    @Nullable
    private String contactEmail;
    @Nullable
    private String contactPhone;
    private AddressRequest address;
    private Integer status;
}
