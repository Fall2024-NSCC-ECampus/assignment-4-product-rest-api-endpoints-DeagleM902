package com.example.couriersystem.service.impl;

import com.example.couriersystem.repository.ReviewRepository;
import com.example.couriersystem.service.ReviewService;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService {
    private ReviewRepository reviewRepository;

    @Override
    public void addReview() {}

    @Override
    public void getAllReviews() {}
}
