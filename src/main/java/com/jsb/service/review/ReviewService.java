package com.jsb.service.review;

import com.jsb.dto.review.ReviewRequest;
import com.jsb.dto.review.ReviewResponse;
import com.jsb.service.CrudService;

public interface ReviewService extends CrudService<Long, ReviewRequest, ReviewResponse> {}
