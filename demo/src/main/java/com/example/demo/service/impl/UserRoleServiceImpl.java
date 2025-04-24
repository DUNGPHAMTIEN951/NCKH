package com.example.demo.service.impl;

import com.example.demo.models.UserRole;
import com.example.demo.repository.UserRoleRepository;
import com.example.demo.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleRepository repository;

    @Override
    public List<UserRole> getAllRoles() {
        return repository.findAll();
    }

    @Override
    public UserRole getRoleById(String id) { // Chuyển từ int sang String
        Optional<UserRole> role = repository.findById(id);
        return role.orElse(null);
    }

    @Override
    public UserRole saveRole(UserRole role) {
        return repository.save(role);
    }

    @Override
    public void deleteRole(String id) { // Chuyển từ int sang String
        repository.deleteById(id);
    }
}