package com.jsb.service.chat;

import com.jsb.dto.chat.MessageRequest;
import com.jsb.dto.chat.MessageResponse;
import com.jsb.service.CrudService;

public interface MessageService extends CrudService<Long, MessageRequest, MessageResponse> {}
