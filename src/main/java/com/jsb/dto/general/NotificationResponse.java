package com.jsb.dto.general;

import lombok.Data;
import org.springframework.lang.Nullable;

import com.jsb.entity.general.NotificationType;

import java.time.Instant;

@Data
public class NotificationResponse {
    private Long id;
    private Instant createdAt;
    private NotificationType type;
    private String message;
    @Nullable
    private String anchor;
    private Integer status;
}
