package com.example.GameReviews.services;

import com.example.GameReviews.entities.Review;
import com.example.GameReviews.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewServices {

    @Autowired
    private ReviewRepository reviewRepository;

    public Review addReview(Review r) {
        return reviewRepository.save(r);
    }

    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    public Optional<Review> findReviewById(Long id) {
        return reviewRepository.findById(id);
    }
}
