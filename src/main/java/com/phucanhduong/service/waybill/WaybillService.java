package com.phucanhduong.service.waybill;

import com.phucanhduong.dto.waybill.GhnCallbackOrderRequest;
import com.phucanhduong.dto.waybill.WaybillRequest;
import com.phucanhduong.dto.waybill.WaybillResponse;
import com.phucanhduong.service.CrudService;

public interface WaybillService extends CrudService<Long, WaybillRequest, WaybillResponse> {

    void callbackStatusWaybillFromGHN(GhnCallbackOrderRequest ghnCallbackOrderRequest);

}
