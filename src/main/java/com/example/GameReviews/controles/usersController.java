package com.example.GameReviews.controles;

import com.example.GameReviews.services.usersServices;
import com.example.GameReviews.entities.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api") // Base mapping for all endpoints in this controller
public class usersController {

    @Autowired
    private usersServices userService;

    @PostMapping("/users")
    public users addUser(@RequestBody users u) {
        return userService.addUser(u);
    }

    @GetMapping("/users/get00")
    public List<users> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public Optional<users> findUserById(@PathVariable Long id) {
        return userService.findUserById(id);
    }
    @PostMapping("/users/login")
    public @ResponseBody users login(@RequestBody users u) {
        System.out.println(u);

        return userService.login(u.getEmail(), u.getPassword());
    }
}
