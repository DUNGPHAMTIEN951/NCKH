package com.example.demo.models;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "computer_network_project") // Định danh MongoDB Collection
public class ComputerNetworkProject {

    @Id
    private String id; // Khóa chính

    private String projectCode;  // Mã dự án mạng máy tính
    private String accountId;    // Tài khoản người dùng liên kết với dự án
    private String projectStatus; // Tình trạng hiện tại của dự án mạng máy tính
    private String tuitionStatus; // Tình trạng học phí liên quan đến dự án mạng máy tính
    private Date createdAt;      // Thời gian khởi tạo dự án
    private Date updatedAt;      // Thời gian cập nhật thông tin dự án
    private String createdBy;    // Người khởi tạo dự án

    // Getters & Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    public String getTuitionStatus() {
        return tuitionStatus;
    }

    public void setTuitionStatus(String tuitionStatus) {
        this.tuitionStatus = tuitionStatus;
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