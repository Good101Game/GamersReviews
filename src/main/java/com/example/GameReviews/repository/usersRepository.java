package com.example.GameReviews.repository;

import com.example.GameReviews.entities.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface usersRepository extends JpaRepository<users,Long> {
}
