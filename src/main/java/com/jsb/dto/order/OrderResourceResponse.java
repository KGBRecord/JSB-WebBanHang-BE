package com.jsb.dto.order;

import lombok.Data;
import org.springframework.lang.Nullable;

import com.jsb.dto.customer.CustomerResourceResponse;

import java.time.Instant;

@Data
public class OrderResourceResponse {
    private Long id;
    private Instant createdAt;
    private Instant updatedAt;
    private String code;
    private String name;
    private String color;
    @Nullable
    private CustomerResourceResponse customerResource;
    private Integer status;
}
