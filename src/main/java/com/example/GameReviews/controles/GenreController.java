package com.example.GameReviews.controles;

import com.example.GameReviews.entities.Genre;
import com.example.GameReviews.services.GenreServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api")
public class GenreController {
    @Autowired
    private GenreServices genreServices;

    @PostMapping("/Genre")
    public Genre addGenre(@RequestBody Genre g) {
        return genreServices.addGenre(g);
    }

    @GetMapping("/Genre")
    public List<Genre> getAllGenre() {
        return genreServices.getAllGenre();
    }

    @GetMapping("/Genre/{id}")
    public Optional<Genre> findGenreById(@PathVariable Long id) {
        return genreServices.findGenreById(id);
    }
}