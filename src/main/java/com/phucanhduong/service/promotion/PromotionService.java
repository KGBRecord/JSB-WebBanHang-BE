package com.phucanhduong.service.promotion;

import com.phucanhduong.dto.promotion.PromotionRequest;
import com.phucanhduong.dto.promotion.PromotionResponse;
import com.phucanhduong.service.CrudService;

import java.time.Instant;

public interface PromotionService extends CrudService<Long, PromotionRequest, PromotionResponse> {

    boolean checkCanCreatePromotionForProduct(Long productId, Instant startDate, Instant endDate);

}
