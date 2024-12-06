package com.phucanhduong.service.inventory;

import com.phucanhduong.dto.inventory.DocketRequest;
import com.phucanhduong.dto.inventory.DocketResponse;
import com.phucanhduong.service.CrudService;

public interface DocketService extends CrudService<Long, DocketRequest, DocketResponse> {}
