package com.jsb.dto.customer;

import com.jsb.dto.authentication.UserRequest;

import lombok.Data;

@Data
public class CustomerRequest {
    private UserRequest user;
    private Long customerGroupId;
    private Long customerStatusId;
    private Long customerResourceId;
}
