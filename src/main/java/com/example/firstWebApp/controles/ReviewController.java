package com.example.firstWebApp.controles;

import com.example.firstWebApp.services.ReviewServices;
import com.example.firstWebApp.entities.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ReviewController {

    @Autowired
    private ReviewServices reviewServices;

    @PostMapping("/Review")
    public Review addUser(@RequestBody Review u) {
        return reviewServices.addReview(u);
    }

    @GetMapping("/Review")
    public List<Review> getAllUsers() {
        return reviewServices.getAllReviews();
    }

    @GetMapping("/Review/{id}")
    public Optional<Review> findUserById(@PathVariable Long id) {
        return reviewServices.findReviewById(id);
    }
}
