package com.example.firstWebApp.services;

import com.example.firstWebApp.entities.Games;
import com.example.firstWebApp.repository.GamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GamesServices {
    @Autowired
    private GamesRepository gameRepository;

    public Games addGame(Games game) {
        return gameRepository.save(game);
    }

    public List<Games> getAllGames() {
        return gameRepository.findAll();
    }

    public Optional<Games> findGamesById(Long id) {
        return gameRepository.findById(id);
    }
}
