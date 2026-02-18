package com.example.game_system.controller;

import com.example.game_system.model.User;
import com.example.game_system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User addUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // 🔄 ОБНОВИТЬ пользователя (пароль/почту)
    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser(@PathVariable Long id, @RequestBody User userDetails) {
        try {
            User user = userService.getUserById(id);

            if (user == null) {
                return ResponseEntity.status(404).body("USER NOT FOUND");
            }

            // Обновляем только то, что пришло в запросе
            if (userDetails.getEmail() != null) {
                user.setEmail(userDetails.getEmail());
            }
            if (userDetails.getPassword() != null) {
                user.setPassword(userDetails.getPassword());
            }

            User updatedUser = userService.saveUser(user);
            return ResponseEntity.ok(updatedUser);

        } catch (Exception e) {
            return ResponseEntity.status(500).body("UPDATE ERROR: " + e.getMessage());
        }
    }
}