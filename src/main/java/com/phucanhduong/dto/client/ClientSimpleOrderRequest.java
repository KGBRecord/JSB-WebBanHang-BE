package com.phucanhduong.dto.client;

import com.phucanhduong.entity.cashbook.PaymentMethodType;
import lombok.Data;

@Data
public class ClientSimpleOrderRequest {
    private PaymentMethodType paymentMethodType;
}
