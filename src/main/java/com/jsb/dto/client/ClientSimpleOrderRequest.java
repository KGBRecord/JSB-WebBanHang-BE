package com.jsb.dto.client;

import com.jsb.entity.cashbook.PaymentMethodType;

import lombok.Data;

@Data
public class ClientSimpleOrderRequest {
    private PaymentMethodType paymentMethodType;
}
