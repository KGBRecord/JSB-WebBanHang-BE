package com.jsb.service.promotion;

import java.time.Instant;

import com.jsb.dto.promotion.PromotionRequest;
import com.jsb.dto.promotion.PromotionResponse;
import com.jsb.service.CrudService;

public interface PromotionService extends CrudService<Long, PromotionRequest, PromotionResponse> {

    boolean checkCanCreatePromotionForProduct(Long productId, Instant startDate, Instant endDate);

}
