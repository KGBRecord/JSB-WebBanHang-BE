package com.jsb.dto.cashbook;

import com.jsb.entity.cashbook.PaymentMethodType;

import lombok.Data;

@Data
public class ClientPaymentMethodResponse {
    private Long paymentMethodId;
    private String paymentMethodName;
    private PaymentMethodType paymentMethodCode;
}
