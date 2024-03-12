package com.example.firstWebApp.repository;

import com.example.firstWebApp.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewsRepository extends JpaRepository<Review,Long> {
}
