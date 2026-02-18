package com.example.game_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // 🏠 Главная страница
    @GetMapping("/")
    public String index() {
        return "index";
    }

    // 📝 Страница регистрации
    @GetMapping("/register")
    public String register() {
        return "register";
    }

    // 🔑 Страница входа
    @GetMapping("/login")
    public String login() {
        return "login"; // <-- добавлена страница входа
    }

    // 👤 Страница профиля
    @GetMapping("/profile")
    public String profile() {
        return "profile";
    }
    // 🕹️ Страница игры Тетрис
    @GetMapping("/tetris")
    public String tetris() {
        return "tetris"; // Возвращает tetris.html
    }
    // 🕹️ Страница игры Пин-понг
    @GetMapping("/pingpong")
    public String pingpong() {
        return "pingpong";
    }

    // 🕹️ Страница игры Змейка
    @GetMapping("/snake")
    public String snake() {
        return "snake";
    }

    // 🕹️ Страница игры Flappy Bird
    @GetMapping("/flappybird")
    public String flappybird() {
        return "flappybird";
    }

    // 🕹️ Страница игры Арканоид
    @GetMapping("/arkanoid")
    public String arkanoid() {
        return "arkanoid";
    }

    // 🕹️ Страница игры Мини гонки
    @GetMapping("/racing")
    public String racing() {
        return "racing";
    }

    // 🕹️ Страница игры Лабиринт
    @GetMapping("/maze")
    public String maze() {
        return "maze";
    }

    // 🕹️ Страница игры Реакция
    @GetMapping("/reaction")
    public String reaction() {
        return "reaction";
    }
}
