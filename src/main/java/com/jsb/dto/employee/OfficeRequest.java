package com.jsb.dto.employee;

import com.jsb.dto.address.AddressRequest;

import lombok.Data;

@Data
public class OfficeRequest {
    private String name;
    private AddressRequest address;
    private Integer status;
}
