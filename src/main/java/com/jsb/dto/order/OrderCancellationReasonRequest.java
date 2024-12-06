package com.jsb.dto.order;

import lombok.Data;
import org.springframework.lang.Nullable;

@Data
public class OrderCancellationReasonRequest {
    private String name;
    @Nullable
    private String note;
    private Integer status;
}
