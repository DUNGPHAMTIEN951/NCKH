package com.example.demo.models;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user_account") // Định danh MongoDB Collection
public class UserAccount {

    @Id
    private String id; // Khóa chính

    private String studentId;    // Mã số sinh viên của người dùng
    private String fullName;     // Họ và tên đầy đủ của người dùng
    private String userRoleId;   // Vai trò của người dùng liên kết với tài khoản
    private String faculty;      // Khoa của người dùng
    private String className;    // Lớp của người dùng
    private String profileImage; // Hình ảnh đại diện của người dùng
    private String email;        // Địa chỉ email của người dùng
    private String phoneNumber;  // Số điện thoại của người dùng
    private Date dateOfBirth;    // Ngày tháng năm sinh của người dùng
    private String gender;       // Giới tính của người dùng
    private String username;     // Tên đăng nhập của người dùng
    private String password;     // Mật khẩu của người dùng
    private Date createdAt;      // Thời gian khởi tạo tài khoản
    private Date updatedAt;      // Thời gian cập nhật tài khoản
    private String createdBy;    // Người khởi tạo tài khoản

    // Getters & Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(String userRoleId) {
        this.userRoleId = userRoleId;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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