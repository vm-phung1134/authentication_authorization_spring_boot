package com.authorize.auth_management_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authorize.auth_management_api.entity.UserSchema;
import com.authorize.auth_management_api.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public UserSchema addNewUser(UserSchema user) {
        return userRepository.save(user);
    }
}
