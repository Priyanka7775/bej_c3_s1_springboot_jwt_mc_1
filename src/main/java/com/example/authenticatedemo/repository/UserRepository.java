package com.example.authenticatedemo.repository;

import com.example.authenticatedemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    public User findByUsernameAndPassword(String username, String password);
}
