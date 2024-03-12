package com.example.firstWebApp.controles;

import com.example.firstWebApp.services.ListsServices;
import com.example.firstWebApp.entities.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ListsController {

    @Autowired
    private ListsServices listServices;

    @PostMapping("/users")
    public Lists list(@RequestBody Lists l) {
        return listServices.addLists(l);
    }

    @GetMapping("/users")
    public List<Lists> getAllUsers() {
        return listServices.getAllLists();
    }

    @GetMapping("/users/{id}")
    public Optional<Lists> findUserById(@PathVariable Long id) {
        return listServices.findListsById(id);
    }
}
