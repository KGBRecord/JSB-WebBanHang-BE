package com.jsb.service.waybill;

import com.jsb.dto.waybill.GhnCallbackOrderRequest;
import com.jsb.dto.waybill.WaybillRequest;
import com.jsb.dto.waybill.WaybillResponse;
import com.jsb.service.CrudService;

public interface WaybillService extends CrudService<Long, WaybillRequest, WaybillResponse> {

    void callbackStatusWaybillFromGHN(GhnCallbackOrderRequest ghnCallbackOrderRequest);

}
