package com.example.game_system.repository;

import com.example.game_system.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Поиск пользователя по имени
    User findByUsername(String username);
}
