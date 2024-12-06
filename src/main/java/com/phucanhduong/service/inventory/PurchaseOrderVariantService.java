package com.phucanhduong.service.inventory;

import com.phucanhduong.dto.inventory.PurchaseOrderVariantRequest;
import com.phucanhduong.dto.inventory.PurchaseOrderVariantResponse;
import com.phucanhduong.entity.inventory.PurchaseOrderVariantKey;
import com.phucanhduong.service.CrudService;

public interface PurchaseOrderVariantService extends CrudService<PurchaseOrderVariantKey, PurchaseOrderVariantRequest,
        PurchaseOrderVariantResponse> {}
