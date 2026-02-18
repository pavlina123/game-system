package com.example.game_system.repository;

import com.example.game_system.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
    // можно добавить свои методы, например findByTitle(String title)
}
