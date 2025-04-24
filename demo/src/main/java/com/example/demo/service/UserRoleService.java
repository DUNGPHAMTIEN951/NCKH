package com.example.service;

import com.example.models.UserRole;
import java.util.List;

public interface UserRoleService {
    List<UserRole> getAllRoles();
    UserRole getRoleById(int id);
    UserRole saveRole(UserRole role);
    void deleteRole(int id);
}