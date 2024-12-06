package com.phucanhduong.service.chat;

import com.phucanhduong.dto.chat.MessageRequest;
import com.phucanhduong.dto.chat.MessageResponse;
import com.phucanhduong.service.CrudService;

public interface MessageService extends CrudService<Long, MessageRequest, MessageResponse> {}
