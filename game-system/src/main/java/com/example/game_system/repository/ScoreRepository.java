package com.example.game_system.repository;

import com.example.game_system.model.Score;
import com.example.game_system.model.User;
import com.example.game_system.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Long> {
    List<Score> findByUser(User user);
    List<Score> findByGame(Game game);
}
