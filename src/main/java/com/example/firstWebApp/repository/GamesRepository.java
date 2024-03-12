package com.example.firstWebApp.repository;

import com.example.firstWebApp.entities.Games;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GamesRepository extends JpaRepository<Games,Long> {
}
