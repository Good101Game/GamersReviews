package com.example.GameReviews.services;

import com.example.GameReviews.entities.users;
import com.example.GameReviews.repository.usersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class usersServices {

    @Autowired
    private usersRepository userRepository;

    public users addUser(users user) {
        return userRepository.save(user);
    }

    public List<users> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<users> findUserById(Long id) {
        return userRepository.findById(id);
    }
}