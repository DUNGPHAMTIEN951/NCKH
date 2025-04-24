package com.example.demo.service;

import java.util.List;
import com.example.demo.models.UserRole;

public interface UserRoleService {
    List<UserRole> getAllRoles();
    UserRole getRoleById(String id); // Chuyển từ int sang String
    UserRole saveRole(UserRole role);
    void deleteRole(String id); // Chuyển từ int sang String
}