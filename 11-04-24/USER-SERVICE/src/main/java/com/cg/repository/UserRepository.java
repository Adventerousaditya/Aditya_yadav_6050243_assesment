package com.cg.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.cg.entity.User;

@Repository
public class UserRepository {

    private Map<Long, User> users = new HashMap<>();

    public UserRepository() {
        users.put(1L, new User(1L, "Amit", "amit@test.com"));
    }

    public User findById(Long id) {
        return users.get(id);
    }
}