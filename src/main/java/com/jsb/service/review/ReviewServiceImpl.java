package com.jsb.service.review;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import com.jsb.constant.FieldName;
import com.jsb.constant.ResourceName;
import com.jsb.constant.SearchFields;
import com.jsb.dto.ListResponse;
import com.jsb.dto.review.ReviewRequest;
import com.jsb.dto.review.ReviewResponse;
import com.jsb.entity.review.Review;
import com.jsb.exception.ResourceNotFoundException;
import com.jsb.mapper.review.ReviewMapper;
import com.jsb.repository.review.ReviewRepository;
import com.jsb.utils.RewardUtils;

import java.util.List;

@Service
@AllArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private ReviewRepository reviewRepository;
    private ReviewMapper reviewMapper;
    private RewardUtils rewardUtils;

    @Override
    public ListResponse<ReviewResponse> findAll(int page, int size, String sort, String filter, String search, boolean all) {
        return defaultFindAll(page, size, sort, filter, search, all, SearchFields.REVIEW, reviewRepository, reviewMapper);
    }

    @Override
    public ReviewResponse findById(Long id) {
        return defaultFindById(id, reviewRepository, reviewMapper, ResourceName.REVIEW);
    }

    @Override
    public ReviewResponse save(ReviewRequest request) {
        return defaultSave(request, reviewRepository, reviewMapper);
    }

    @Override
    public ReviewResponse save(Long id, ReviewRequest request) {
        Review review = reviewRepository.findById(id)
                .map(existingEntity -> reviewMapper.partialUpdate(existingEntity, request))
                .map(reviewRepository::save)
                .orElseThrow(() -> new ResourceNotFoundException(ResourceName.DOCKET, FieldName.ID, id));

        rewardUtils.approveReviewHook(review);

        return reviewMapper.entityToResponse(review);
    }

    @Override
    public void delete(Long id) {
        reviewRepository.deleteById(id);
    }

    @Override
    public void delete(List<Long> ids) {
        reviewRepository.deleteAllById(ids);
    }

}
