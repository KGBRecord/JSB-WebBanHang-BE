package com.jsb.dto.general;

import lombok.Data;
import org.springframework.lang.Nullable;

import com.jsb.entity.general.NotificationType;

@Data
public class NotificationRequest {
    private Long userId;
    private NotificationType type;
    private String message;
    @Nullable
    private String anchor;
    private Integer status;
}
