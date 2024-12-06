package com.jsb.dto.customer;

import lombok.Data;

import java.time.Instant;

import com.jsb.dto.authentication.UserResponse;

@Data
public class CustomerResponse {
    private Long id;
    private Instant createdAt;
    private Instant updatedAt;
    private UserResponse user;
    private CustomerGroupResponse customerGroup;
    private CustomerStatusResponse customerStatus;
    private CustomerResourceResponse customerResource;
}
