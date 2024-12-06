package com.jsb.dto.inventory;

import lombok.Data;

import java.time.Instant;

import com.jsb.dto.product.VariantResponse;

@Data
public class StorageLocationResponse {
    private Long id;
    private Instant createdAt;
    private Instant updatedAt;
    private WarehouseResponse warehouse;
    private VariantResponse variant;
    private String name;
}
