package com.example.authenticatedemo.services;

import com.example.authenticatedemo.domain.User;
import com.example.authenticatedemo.exception.UserNotFoundException;

import java.util.List;

public interface UserServices {

    public User addUser(User user);
    public User findByUsernameAndPassword(String username , String password) throws UserNotFoundException;
    List<User> getAllUsers();

    boolean deleteUser(int userid) throws UserNotFoundException;

}
