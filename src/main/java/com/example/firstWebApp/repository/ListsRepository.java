package com.example.firstWebApp.repository;

import com.example.firstWebApp.entities.Lists;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListsRepository extends JpaRepository<Lists,Long> {
}
