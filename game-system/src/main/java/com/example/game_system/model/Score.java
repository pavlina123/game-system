package com.example.game_system.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "scores")
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int score;
    private LocalDateTime date = LocalDateTime.now();

    // Связь с пользователем
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Связь с игрой
    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    public Score() {}

    public Score(int score, User user, Game game) {
        this.score = score;
        this.user = user;
        this.game = game;
    }

    // --- Геттеры и сеттеры ---
    public Long getId() { return id; }

    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }

    public LocalDateTime getDate() { return date; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public Game getGame() { return game; }
    public void setGame(Game game) { this.game = game; }
}
