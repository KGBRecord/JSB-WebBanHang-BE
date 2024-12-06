package com.phucanhduong.service.inventory;

import com.phucanhduong.constant.FieldName;
import com.phucanhduong.constant.ResourceName;
import com.phucanhduong.constant.SearchFields;
import com.phucanhduong.dto.ListResponse;
import com.phucanhduong.dto.inventory.DocketRequest;
import com.phucanhduong.dto.inventory.DocketResponse;
import com.phucanhduong.entity.client.Preorder;
import com.phucanhduong.entity.general.Notification;
import com.phucanhduong.entity.general.NotificationType;
import com.phucanhduong.entity.inventory.Docket;
import com.phucanhduong.exception.ResourceNotFoundException;
import com.phucanhduong.mapper.general.NotificationMapper;
import com.phucanhduong.mapper.inventory.DocketMapper;
import com.phucanhduong.repository.client.PreorderRepository;
import com.phucanhduong.repository.general.NotificationRepository;
import com.phucanhduong.repository.inventory.DocketRepository;
import com.phucanhduong.service.general.NotificationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Slf4j
public class DocketServiceImpl implements DocketService {

    private DocketRepository docketRepository;

    private DocketMapper docketMapper;

    private PreorderRepository preorderRepository;

    private NotificationRepository notificationRepository;

    private NotificationService notificationService;

    private NotificationMapper notificationMapper;

    @Override
    public ListResponse<DocketResponse> findAll(int page, int size, String sort, String filter, String search, boolean all) {
        return defaultFindAll(page, size, sort, filter, search, all, SearchFields.DOCKET, docketRepository, docketMapper);
    }

    @Override
    public DocketResponse findById(Long id) {
        return defaultFindById(id, docketRepository, docketMapper, ResourceName.DOCKET);
    }

    @Override
    public DocketResponse save(DocketRequest request) {
        Docket docket = docketRepository.save(docketMapper.requestToEntity(request));
        afterCreateOrUpdateCallback(docket);
        return docketMapper.entityToResponse(docket);
    }

    @Override
    public DocketResponse save(Long id, DocketRequest request) {
        Docket docket = docketRepository.findById(id)
                .map(existingEntity -> docketMapper.partialUpdate(existingEntity, request))
                .map(docketRepository::save)
                .orElseThrow(() -> new ResourceNotFoundException(ResourceName.DOCKET, FieldName.ID, id));
        afterCreateOrUpdateCallback(docket);
        return docketMapper.entityToResponse(docket);
    }

    private void afterCreateOrUpdateCallback(Docket docket) {
        // Docket nhập (1) có trạng thái Hoàn thành (3)
        if (docket.getType().equals(1) && docket.getStatus().equals(3)) {
            List<Long> productIds = docket.getDocketVariants().stream()
                    .map(docketVariant -> docketVariant.getVariant().getProduct().getId())
                    .distinct()
                    .collect(Collectors.toList());

            List<Preorder> preorders = preorderRepository.findByProduct_IdInAndStatus(productIds, 1);

            List<Notification> notifications = preorders.stream()
                    .map(preorder -> new Notification()
                            .setUser(preorder.getUser())
                            .setType(NotificationType.PREORDER)
                            .setMessage(String.format("Sản phẩm %s đã có hàng. Vui lòng kiểm tra.", preorder.getProduct().getName()))
                            .setAnchor("/product/" + preorder.getProduct().getSlug())
                            .setStatus(1))
                    .collect(Collectors.toList());

            notificationRepository.saveAll(notifications);

            notifications.forEach(notification -> notificationService
                    .pushNotification(notification.getUser().getUsername(), notificationMapper.entityToResponse(notification)));

            preorders.forEach(preorder -> {
                preorder.setUpdatedAt(Instant.now());
                preorder.setStatus(2);
            });

            preorderRepository.saveAll(preorders);

            List<String> usernames = notifications.stream()
                    .map(notification -> notification.getUser().getUsername())
                    .collect(Collectors.toList());

            log.info("Push notifications for users: " + usernames);
        }
    }

    @Override
    public void delete(Long id) {
        docketRepository.deleteById(id);
    }

    @Override
    public void delete(List<Long> ids) {
        docketRepository.deleteAllById(ids);
    }

}
