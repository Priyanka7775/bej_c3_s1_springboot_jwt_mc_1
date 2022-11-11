package com.example.authenticatedemo.services;

import com.example.authenticatedemo.domain.User;

import java.util.Map;

public interface SecurityTokenGenerator {
    Map<String,String>generateToken(User user);
}
