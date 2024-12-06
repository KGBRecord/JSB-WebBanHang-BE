package com.phucanhduong.service.inventory;

import com.phucanhduong.dto.inventory.CountVariantRequest;
import com.phucanhduong.dto.inventory.CountVariantResponse;
import com.phucanhduong.entity.inventory.CountVariantKey;
import com.phucanhduong.service.CrudService;

public interface CountVariantService extends CrudService<CountVariantKey, CountVariantRequest, CountVariantResponse> {}
