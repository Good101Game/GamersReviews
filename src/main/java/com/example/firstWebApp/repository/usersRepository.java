package com.example.firstWebApp.repository;

import com.example.firstWebApp.entities.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface usersRepository extends JpaRepository<users,Long> {
}
