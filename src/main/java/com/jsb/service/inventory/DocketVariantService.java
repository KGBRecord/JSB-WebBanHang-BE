package com.jsb.service.inventory;

import com.jsb.dto.inventory.DocketVariantRequest;
import com.jsb.dto.inventory.DocketVariantResponse;
import com.jsb.entity.inventory.DocketVariantKey;
import com.jsb.service.CrudService;

public interface DocketVariantService extends CrudService<DocketVariantKey, DocketVariantRequest, DocketVariantResponse> {}
