package com.phucanhduong.service.inventory;

import com.phucanhduong.dto.inventory.DocketVariantRequest;
import com.phucanhduong.dto.inventory.DocketVariantResponse;
import com.phucanhduong.entity.inventory.DocketVariantKey;
import com.phucanhduong.service.CrudService;

public interface DocketVariantService extends CrudService<DocketVariantKey, DocketVariantRequest, DocketVariantResponse> {}
