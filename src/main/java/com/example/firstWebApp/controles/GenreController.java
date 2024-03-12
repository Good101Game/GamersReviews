package com.example.firstWebApp.controles;

import com.example.firstWebApp.entities.Genre;
import com.example.firstWebApp.services.GenreServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api")
public class GenreController {
    @Autowired
    private GenreServices genreServices;

    @PostMapping("/Games")
    public Genre addGame(@RequestBody Genre g) {
        return genreServices.addGenre(g);
    }

    @GetMapping("/Games")
    public List<Genre> getAllGames() {
        return genreServices.getAllGenre();
    }

    @GetMapping("/Games/{id}")
    public Optional<Genre> findGamesById(@PathVariable Long id) {
        return genreServices.findGenreById(id);
    }
}