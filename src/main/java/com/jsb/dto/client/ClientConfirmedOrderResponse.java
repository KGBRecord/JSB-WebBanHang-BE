package com.jsb.dto.client;

import lombok.Data;
import org.springframework.lang.Nullable;

import com.jsb.entity.cashbook.PaymentMethodType;

@Data
public class ClientConfirmedOrderResponse {
    private String orderCode;
    private PaymentMethodType orderPaymentMethodType;
    @Nullable
    private String orderPaypalCheckoutLink;
}
