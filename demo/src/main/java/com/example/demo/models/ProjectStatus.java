package com.example.demo.models;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "project_status") // Định danh MongoDB Collection
public class ProjectStatus {

    @Id
    private String id; // Khóa chính

    private int statusNumber;   // Số tình trạng của dự án
    private String statusName;  // Tên tình trạng của dự án
    private Date createdAt;     // Thời gian khởi tạo tình trạng dự án
    private Date updatedAt;     // Thời gian cập nhật tình trạng dự án
    private String createdBy;   // Người khởi tạo tình trạng dự án

    // Getters & Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStatusNumber() {
        return statusNumber;
    }

    public void setStatusNumber(int statusNumber) {
        this.statusNumber = statusNumber;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
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