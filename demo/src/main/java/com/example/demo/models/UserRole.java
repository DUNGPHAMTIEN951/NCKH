package com.example.demo.models;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user_role") // Định danh MongoDB Collection
public class UserRole {

    @Id
    private String id; // Khóa chính

    private int roleNumber;   // Số vai trò của người dùng
    private String roleName;  // Tên vai trò của người dùng
    private Date createdAt;   // Thời gian khởi tạo vai trò người dùng
    private Date updatedAt;   // Thời gian cập nhật vai trò người dùng
    private String createdBy; // Người khởi tạo vai trò người dùng

    // Getters & Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRoleNumber() {
        return roleNumber;
    }

    public void setRoleNumber(int roleNumber) {
        this.roleNumber = roleNumber;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}