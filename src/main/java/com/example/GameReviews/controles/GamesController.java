package com.example.GameReviews.controles;

import com.example.GameReviews.services.GamesServices;
import com.example.GameReviews.entities.Games;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api") // Base mapping for all endpoints in this controller
public class GamesController {
    @Autowired
    private GamesServices gamesService;

    @PostMapping("/Games")
    public Games addGame(@RequestBody Games g) {
        return gamesService.addGame(g);
    }

    @GetMapping("/Games")
    public List<Games> getAllGames() {
        return gamesService.getAllGames();
    }

    @GetMapping("/Games/{id}")
    public Optional<Games> findGamesById(@PathVariable Long id) {
        return gamesService.findGamesById(id);
    }
}
