package com.example.service.impl;

import com.example.models.UserRole;
import com.example.repository.UserRoleRepository;
import com.example.service.UserRoleService;
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
    public UserRole getRoleById(int id) {
        Optional<UserRole> role = repository.findById(id);
        return role.orElse(null);
    }

    @Override
    public UserRole saveRole(UserRole role) {
        return repository.save(role);
    }

    @Override
    public void deleteRole(int id) {
        repository.deleteById(id);
    }
}