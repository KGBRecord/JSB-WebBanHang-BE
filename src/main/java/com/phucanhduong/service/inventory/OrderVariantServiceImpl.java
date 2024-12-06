package com.phucanhduong.service.inventory;

import com.phucanhduong.constant.ResourceName;
import com.phucanhduong.constant.SearchFields;
import com.phucanhduong.dto.ListResponse;
import com.phucanhduong.dto.order.OrderVariantRequest;
import com.phucanhduong.dto.order.OrderVariantResponse;
import com.phucanhduong.entity.order.OrderVariantKey;
import com.phucanhduong.mapper.order.OrderVariantMapper;
import com.phucanhduong.repository.order.OrderVariantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderVariantServiceImpl implements OrderVariantService {

    private OrderVariantRepository orderVariantRepository;

    private OrderVariantMapper orderVariantMapper;

    @Override
    public ListResponse<OrderVariantResponse> findAll(int page, int size, String sort, String filter, String search, boolean all) {
        return defaultFindAll(page, size, sort, filter, search, all, SearchFields.ORDER_VARIANT, orderVariantRepository, orderVariantMapper);
    }

    @Override
    public OrderVariantResponse findById(OrderVariantKey id) {
        return defaultFindById(id, orderVariantRepository, orderVariantMapper, ResourceName.ORDER_VARIANT);
    }

    @Override
    public OrderVariantResponse save(OrderVariantRequest request) {
        return defaultSave(request, orderVariantRepository, orderVariantMapper);
    }

    @Override
    public OrderVariantResponse save(OrderVariantKey id, OrderVariantRequest request) {
        return defaultSave(id, request, orderVariantRepository, orderVariantMapper, ResourceName.ORDER_VARIANT);
    }

    @Override
    public void delete(OrderVariantKey id) {
        orderVariantRepository.deleteById(id);
    }

    @Override
    public void delete(List<OrderVariantKey> ids) {
        orderVariantRepository.deleteAllById(ids);
    }

}
