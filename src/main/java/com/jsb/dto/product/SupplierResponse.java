package com.jsb.dto.product;

import lombok.Data;

import java.time.Instant;

import com.jsb.dto.address.AddressResponse;

@Data
public class SupplierResponse {
    private Long id;
    private Instant createdAt;
    private Instant updatedAt;
    private String displayName;
    private String code;
    private String contactFullname;
    private String contactEmail;
    private String contactPhone;
    private String companyName;
    private String taxCode;
    private String email;
    private String phone;
    private String fax;
    private String website;
    private AddressResponse address;
    private String description;
    private String note;
    private Integer status;
}
