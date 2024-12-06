package com.phucanhduong.dto.client;

import lombok.Data;

@Data
public class ClientWishRequest {
    private Long userId;
    private Long productId;
}
