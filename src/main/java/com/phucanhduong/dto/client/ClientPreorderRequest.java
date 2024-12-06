package com.phucanhduong.dto.client;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ClientPreorderRequest {
    private Long userId;
    private Long productId;
    private Integer status;
}
