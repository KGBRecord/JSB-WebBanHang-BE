package com.jsb.service.inventory;

import com.jsb.dto.order.OrderVariantRequest;
import com.jsb.dto.order.OrderVariantResponse;
import com.jsb.entity.order.OrderVariantKey;
import com.jsb.service.CrudService;

public interface OrderVariantService extends CrudService<OrderVariantKey, OrderVariantRequest, OrderVariantResponse> {}
