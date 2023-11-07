package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.repository.Repository;

public interface UserRepository extends Repository<User, Long> {
    User findByUserId(Long userId);
}
