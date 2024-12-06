package com.phucanhduong.dto.client;

import lombok.Data;

@Data
public class ClientCartVariantRequest {
    private Long variantId;
    private Integer quantity;
}
