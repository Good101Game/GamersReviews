package com.example.GameReviews.controles;

import com.example.GameReviews.services.ListsServices;
import com.example.GameReviews.entities.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ListsController {

    @Autowired
    private ListsServices listServices;

    @PostMapping("/Lists")
    public Lists list(@RequestBody Lists l) {
        return listServices.addLists(l);
    }

    @GetMapping("/Lists")
    public List<Lists> getAllLists() {
        return listServices.getAllLists();
    }

    @GetMapping("/Lists/{id}")
    public Optional<Lists> findListsById(@PathVariable Long id) {
        return listServices.findListsById(id);
    }
}
