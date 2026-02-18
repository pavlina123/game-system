package com.example.game_system.controller;

import com.example.game_system.model.Game;
import com.example.game_system.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public String showGames(Model model) {
        List<Game> games = gameService.getAllGames();
        model.addAttribute("games", games);
        return "games"; // Это загрузит файл templates/games.html
    }

    @GetMapping("/{id}")
    public String getGameDetails(@PathVariable Long id, Model model) {
        Game game = gameService.getGameById(id);
        model.addAttribute("game", game);
        return "game-details"; // например, templates/game-details.html
    }
}
