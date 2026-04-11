package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.User;
import com.cg.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User getUserById(Long id) {
        User user = repository.findById(id);

        if (user == null) {
            throw new RuntimeException("User not found with id: " + id);
        }

        return user;
    }
}