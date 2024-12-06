package com.phucanhduong.service.review;

import com.phucanhduong.dto.review.ReviewRequest;
import com.phucanhduong.dto.review.ReviewResponse;
import com.phucanhduong.service.CrudService;

public interface ReviewService extends CrudService<Long, ReviewRequest, ReviewResponse> {}
