package com.phucanhduong.service.inventory;

import com.phucanhduong.constant.ResourceName;
import com.phucanhduong.constant.SearchFields;
import com.phucanhduong.dto.ListResponse;
import com.phucanhduong.dto.inventory.CountVariantRequest;
import com.phucanhduong.dto.inventory.CountVariantResponse;
import com.phucanhduong.entity.inventory.CountVariantKey;
import com.phucanhduong.mapper.inventory.CountVariantMapper;
import com.phucanhduong.repository.inventory.CountVariantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CountVariantServiceImpl implements CountVariantService {

    private CountVariantRepository countVariantRepository;

    private CountVariantMapper countVariantMapper;

    @Override
    public ListResponse<CountVariantResponse> findAll(int page, int size, String sort, String filter, String search, boolean all) {
        return defaultFindAll(page, size, sort, filter, search, all, SearchFields.COUNT_VARIANT, countVariantRepository, countVariantMapper);
    }

    @Override
    public CountVariantResponse findById(CountVariantKey id) {
        return defaultFindById(id, countVariantRepository, countVariantMapper, ResourceName.COUNT_VARIANT);
    }

    @Override
    public CountVariantResponse save(CountVariantRequest request) {
        return defaultSave(request, countVariantRepository, countVariantMapper);
    }

    @Override
    public CountVariantResponse save(CountVariantKey id, CountVariantRequest request) {
        return defaultSave(id, request, countVariantRepository, countVariantMapper, ResourceName.COUNT_VARIANT);
    }

    @Override
    public void delete(CountVariantKey id) {
        countVariantRepository.deleteById(id);
    }

    @Override
    public void delete(List<CountVariantKey> ids) {
        countVariantRepository.deleteAllById(ids);
    }

}
