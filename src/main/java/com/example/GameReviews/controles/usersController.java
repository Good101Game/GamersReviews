package com.example.GameReviews.controles;

import com.example.GameReviews.services.usersServices;
import com.example.GameReviews.entities.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class usersController {

    @Autowired
    private usersServices userService;

    @PostMapping("/users/addUser")
    public user addUser(@RequestBody user u) {
        return userService.addUser(u);
    }

    @GetMapping("/users/getAllUsers")
    public List<user> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/users/findUserById")
    public Optional<user> findUserById(@PathVariable Long id) {
        return userService.findUserById(id);
    }
    @PostMapping("/users/login")
    public @ResponseBody
    user login(@RequestBody user u) {
        System.out.println(u);

        return userService.login(u.getEmail(), u.getPassword());
    }
    @PostMapping("/users/Signup")
    public @ResponseBody
    user Sign_up(@RequestBody user u) {
        System.out.println(u);

        return userService.Sign_up(u.getName(), u.getEmail(), u.getPassword());
    }
}
