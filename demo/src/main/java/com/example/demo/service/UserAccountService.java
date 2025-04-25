package com.example.demo.service;

import java.util.List;

import com.example.demo.models.UserAccount;

public interface UserAccountService {
    List<UserAccount> getAllUsers();
    UserAccount getUserById(String id);
    UserAccount saveUser(UserAccount user);
    UserAccount updateUser(String id, UserAccount user); 
    void deleteUser(String id);
}