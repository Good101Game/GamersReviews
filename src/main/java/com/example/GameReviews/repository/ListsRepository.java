package com.example.GameReviews.repository;

import com.example.GameReviews.entities.Lists;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListsRepository extends JpaRepository<Lists,Long> {
}
