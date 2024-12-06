package com.jsb.service.inventory;

import com.jsb.dto.inventory.DocketRequest;
import com.jsb.dto.inventory.DocketResponse;
import com.jsb.service.CrudService;

public interface DocketService extends CrudService<Long, DocketRequest, DocketResponse> {}
