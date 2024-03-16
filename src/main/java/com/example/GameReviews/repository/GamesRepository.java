package com.example.GameReviews.repository;

import com.example.GameReviews.entities.Games;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GamesRepository extends JpaRepository<Games,Long> {
}
