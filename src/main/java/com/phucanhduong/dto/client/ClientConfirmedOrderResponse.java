package com.phucanhduong.dto.client;

import com.phucanhduong.entity.cashbook.PaymentMethodType;
import lombok.Data;
import org.springframework.lang.Nullable;

@Data
public class ClientConfirmedOrderResponse {
    private String orderCode;
    private PaymentMethodType orderPaymentMethodType;
    @Nullable
    private String orderPaypalCheckoutLink;
}
