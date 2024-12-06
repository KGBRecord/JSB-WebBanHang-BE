package com.jsb.dto.inventory;

import lombok.Data;

@Data
public class CountVariantKeyRequest {
    private Long countId;
    private Long variantId;
}
