package com.jsb.service.inventory;

import com.jsb.dto.inventory.PurchaseOrderVariantRequest;
import com.jsb.dto.inventory.PurchaseOrderVariantResponse;
import com.jsb.entity.inventory.PurchaseOrderVariantKey;
import com.jsb.service.CrudService;

public interface PurchaseOrderVariantService extends CrudService<PurchaseOrderVariantKey, PurchaseOrderVariantRequest,
        PurchaseOrderVariantResponse> {}
