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
    public UserRole getRoleById(String id) {
        Optional<UserRole> role = repository.findById(id);
        return role.orElse(null);
    }

    @Override
    public UserRole saveRole(UserRole role) {
        return repository.save(role);
    }

    @Override
    public UserRole updateRole(String id, UserRole updatedRole) {
        Optional<UserRole> existingRole = repository.findById(id);
        if (existingRole.isPresent()) {
            UserRole role = existingRole.get();
            role.setRoleNumber(updatedRole.getRoleNumber());
            role.setRoleName(updatedRole.getRoleName());
            role.setUpdatedAt(updatedRole.getUpdatedAt());
            role.setCreatedBy(updatedRole.getCreatedBy());
            return repository.save(role);
        }
        return null;
    }

    @Override
    public void deleteRole(String id) {
        repository.deleteById(id);
    }
}