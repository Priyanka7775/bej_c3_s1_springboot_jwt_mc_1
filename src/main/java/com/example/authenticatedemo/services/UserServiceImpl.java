package com.example.authenticatedemo.services;

import com.example.authenticatedemo.domain.User;
import com.example.authenticatedemo.exception.UserNotFoundException;
import com.example.authenticatedemo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserServices{

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findByUsernameAndPassword(String username, String password) throws UserNotFoundException {
        User user=userRepository.findByUsernameAndPassword(username, password);
        if(user==null){
            throw new UserNotFoundException();
        }
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public boolean deleteUser(int userid) throws UserNotFoundException {
        boolean result=false;
        if(userRepository.findById(userid).isEmpty()){
            throw new UserNotFoundException();
        }
        else{
            userRepository.deleteById(userid);
            return true;
        }

    }
}
