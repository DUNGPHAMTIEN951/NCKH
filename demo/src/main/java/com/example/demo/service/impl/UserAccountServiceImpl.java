package com.example.demo.service.impl;

import com.example.demo.models.UserAccount;
import com.example.demo.repository.UserAccountRepository;
import com.example.demo.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserAccountServiceImpl implements UserAccountService {

    @Autowired
    private UserAccountRepository repository;

    @Override
    public List<UserAccount> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public UserAccount getUserById(String id) { // Chuyển từ int sang String
        Optional<UserAccount> user = repository.findById(id);
        return user.orElse(null);
    }

    @Override
    public UserAccount saveUser(UserAccount user) {
        return repository.save(user);
    }

    @Override
    public void deleteUser(String id) { // Chuyển từ int sang String
        repository.deleteById(id);
    }
}