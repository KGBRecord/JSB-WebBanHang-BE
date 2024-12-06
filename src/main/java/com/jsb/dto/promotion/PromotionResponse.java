package com.jsb.dto.promotion;

import lombok.Data;

import java.time.Instant;
import java.util.Set;

import com.jsb.dto.product.ProductResponse;

@Data
public class PromotionResponse {
    private Long id;
    private Instant createdAt;
    private Instant updatedAt;
    private String name;
    private Instant startDate;
    private Instant endDate;
    private Integer percent;
    private Integer status;
    private Set<ProductResponse> products;
}
