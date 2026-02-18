package com.example.game_system.controller;

import com.example.game_system.model.Score;
import com.example.game_system.model.User;
import com.example.game_system.model.Game;
import com.example.game_system.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/scores")
@CrossOrigin(origins = "http://localhost:3000")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @GetMapping
    public List<Score> getAllScores() {
        return scoreService.getAllScores();
    }

    @GetMapping("/{id}")
    public Score getScoreById(@PathVariable Long id) {
        return scoreService.getScoreById(id);
    }

    @PostMapping
    public Score createScore(@RequestBody Score score) {
        return scoreService.saveScore(score);
    }

    @DeleteMapping("/{id}")
    public void deleteScore(@PathVariable Long id) {
        scoreService.deleteScore(id);
    }
}
