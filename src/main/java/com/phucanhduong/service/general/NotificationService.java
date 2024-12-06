package com.phucanhduong.service.general;

import com.phucanhduong.dto.general.NotificationResponse;

public interface NotificationService {

    void pushNotification(String uniqueKey, NotificationResponse notification);

}
