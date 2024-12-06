package com.phucanhduong.service.order;

import com.phucanhduong.dto.client.ClientConfirmedOrderResponse;
import com.phucanhduong.dto.client.ClientSimpleOrderRequest;

public interface OrderService {

    void cancelOrder(String code);

    ClientConfirmedOrderResponse createClientOrder(ClientSimpleOrderRequest request);

    void captureTransactionPaypal(String paypalOrderId, String payerId);

}
