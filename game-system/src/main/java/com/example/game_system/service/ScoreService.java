package com.example.game_system.service;

import com.example.game_system.model.Score;
import com.example.game_system.model.User;
import com.example.game_system.model.Game;
import com.example.game_system.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreService {
    @Autowired
    private ScoreRepository scoreRepository;

    public List<Score> getAllScores() {
        return scoreRepository.findAll();
    }

    public Score getScoreById(Long id) {
        return scoreRepository.findById(id).orElse(null);
    }

    public Score saveScore(Score score) {
        return scoreRepository.save(score);
    }

    public List<Score> getScoresByUser(User user) {
        return scoreRepository.findByUser(user);
    }

    public List<Score> getScoresByGame(Game game) {
        return scoreRepository.findByGame(game);
    }

    public void deleteScore(Long id) {
        scoreRepository.deleteById(id);
    }
}
