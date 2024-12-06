package com.phucanhduong.mapper.cashbook;

import com.phucanhduong.dto.cashbook.ClientPaymentMethodResponse;
import com.phucanhduong.dto.cashbook.PaymentMethodRequest;
import com.phucanhduong.dto.cashbook.PaymentMethodResponse;
import com.phucanhduong.entity.cashbook.PaymentMethod;
import com.phucanhduong.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PaymentMethodMapper extends GenericMapper<PaymentMethod, PaymentMethodRequest, PaymentMethodResponse> {

    @Mapping(source = "id", target = "paymentMethodId")
    @Mapping(source = "name", target = "paymentMethodName")
    @Mapping(source = "code", target = "paymentMethodCode")
    ClientPaymentMethodResponse entityToClientResponse(PaymentMethod entity);

    List<ClientPaymentMethodResponse> entityToClientResponse(List<PaymentMethod> entities);

}
