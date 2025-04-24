package com.example.demo.service;

import java.util.List;
import com.example.demo.models.UserAccount;

public interface UserAccountService {
    List<UserAccount> getAllUsers();
    UserAccount getUserById(String id); // Chuyển từ int sang String
    UserAccount saveUser(UserAccount user);
    void deleteUser(String id); // Chuyển từ int sang String
}