package com.jsb.dto.cashbook;

import lombok.Data;

import java.time.Instant;

import com.jsb.entity.cashbook.PaymentMethodType;

@Data
public class PaymentMethodResponse {
    private Long id;
    private Instant createdAt;
    private Instant updatedAt;
    private String name;
    private PaymentMethodType code;
    private Integer status;
}
