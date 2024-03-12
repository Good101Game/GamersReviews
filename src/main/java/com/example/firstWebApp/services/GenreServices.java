package com.example.firstWebApp.services;

import com.example.firstWebApp.entities.Genre;
import com.example.firstWebApp.entities.users;
import com.example.firstWebApp.repository.GenreRepository;
import com.example.firstWebApp.repository.usersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenreServices {

    @Autowired
    private GenreRepository genreRepository;

    public Genre addGenre(Genre genre) {
        return genreRepository.save(genre);
    }

    public List<Genre> getAllGenre() {
        return genreRepository.findAll();
    }

    public Optional<Genre> findGenreById(Long id) {
        return genreRepository.findById(id);
    }

}
