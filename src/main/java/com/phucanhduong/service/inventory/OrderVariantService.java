package com.phucanhduong.service.inventory;

import com.phucanhduong.dto.order.OrderVariantRequest;
import com.phucanhduong.dto.order.OrderVariantResponse;
import com.phucanhduong.entity.order.OrderVariantKey;
import com.phucanhduong.service.CrudService;

public interface OrderVariantService extends CrudService<OrderVariantKey, OrderVariantRequest, OrderVariantResponse> {}
