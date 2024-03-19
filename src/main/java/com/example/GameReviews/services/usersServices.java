package com.example.GameReviews.services;

import com.example.GameReviews.entities.user;
import com.example.GameReviews.repository.usersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class usersServices {

    @Autowired
    private usersRepository userRepository;

    public user addUser(user user) {
        return userRepository.save(user);
    }

    public List<user> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<user> findUserById(Long id) {
        return userRepository.findById(id);
    }
    public user login(String email , String password){
        System.out.println("email:  "+email+" password: "+password);
        List<user> all=getAllUsers();
        for (user a : all) {
            if (a.getPassword().equals(password) && a.getEmail().equals(email)) return a;
        }
        return new user();
    }

    public user Sign_up(user u) {
      //  System.out.println("id: " + id + " Name: " + Name + " Email: " + email + " password: " + password);

        List<user> all = getAllUsers();
        for (user existingUser : all) {
            if (existingUser.getEmail().equals(u.getEmail())) {
                return null;
            }
        }
        //user newUser = new user(id, Name, email, password);
        addUser(u);

        return u;
    }

}