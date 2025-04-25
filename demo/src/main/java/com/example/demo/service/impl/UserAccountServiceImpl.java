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
    public UserAccount getUserById(String id) {
        Optional<UserAccount> user = repository.findById(id);
        return user.orElse(null);
    }

    @Override
    public UserAccount saveUser(UserAccount user) {
        return repository.save(user);
    }

    @Override
    public UserAccount updateUser(String id, UserAccount updatedUser) {
        Optional<UserAccount> existingUser = repository.findById(id);
        if (existingUser.isPresent()) {
            UserAccount user = existingUser.get();
            user.setFullName(updatedUser.getFullName()); // Sửa từ setName thành setFullName
            user.setEmail(updatedUser.getEmail());
            user.setUserRoleId(updatedUser.getUserRoleId()); // Sửa từ setRole thành setUserRoleId
            user.setFaculty(updatedUser.getFaculty());
            user.setClassName(updatedUser.getClassName());
            user.setProfileImage(updatedUser.getProfileImage());
            user.setPhoneNumber(updatedUser.getPhoneNumber());
            user.setDateOfBirth(updatedUser.getDateOfBirth());
            user.setGender(updatedUser.getGender());
            user.setUsername(updatedUser.getUsername());
            user.setPassword(updatedUser.getPassword());
            user.setUpdatedAt(updatedUser.getUpdatedAt());
            user.setCreatedBy(updatedUser.getCreatedBy());
            return repository.save(user);
        }
        return null;
    }

    @Override
    public void deleteUser(String id) {
        repository.deleteById(id);
    }
}