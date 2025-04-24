package com.example.service.impl;

import com.example.models.UserAccount;
import com.example.repository.UserAccountRepository;
import com.example.service.UserAccountService;
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
    public UserAccount getUserById(int id) {
        Optional<UserAccount> user = repository.findById(id);
        return user.orElse(null);
    }

    @Override
    public UserAccount saveUser(UserAccount user) {
        return repository.save(user);
    }

    @Override
    public void deleteUser(int id) {
        repository.deleteById(id);
    }
}