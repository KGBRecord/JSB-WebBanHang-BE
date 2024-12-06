package com.jsb.service.inventory;

import com.jsb.dto.inventory.CountVariantRequest;
import com.jsb.dto.inventory.CountVariantResponse;
import com.jsb.entity.inventory.CountVariantKey;
import com.jsb.service.CrudService;

public interface CountVariantService extends CrudService<CountVariantKey, CountVariantRequest, CountVariantResponse> {}
