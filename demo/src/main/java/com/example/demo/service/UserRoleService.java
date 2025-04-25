package com.example.demo.service;

import java.util.List;
import com.example.demo.models.UserRole;

public interface UserRoleService {
    List<UserRole> getAllRoles();
    UserRole getRoleById(String id);
    UserRole saveRole(UserRole role);
    UserRole updateRole(String id, UserRole role); 
    void deleteRole(String id);
}