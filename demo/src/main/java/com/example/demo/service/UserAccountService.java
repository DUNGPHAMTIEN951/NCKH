package com.example.service;

import com.example.models.UserAccount;
import java.util.List;

public interface UserAccountService {
    List<UserAccount> getAllUsers();
    UserAccount getUserById(int id);
    UserAccount saveUser(UserAccount user);
    void deleteUser(int id);
}