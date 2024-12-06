package com.jsb.dto.employee;

import lombok.Data;

import java.time.Instant;

import com.jsb.dto.address.AddressResponse;

@Data
public class OfficeResponse {
    private Long id;
    private Instant createdAt;
    private Instant updatedAt;
    private String name;
    private AddressResponse address;
    private Integer status;
}
