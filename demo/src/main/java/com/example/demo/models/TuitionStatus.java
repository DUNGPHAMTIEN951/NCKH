package com.example.demo.models;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tuition_status") // Định danh MongoDB Collection
public class TuitionStatus {

    @Id
    private String id; // Khóa chính

    private int statusNumber;   // Số tình trạng của học phí
    private String statusName;  // Tên tình trạng của học phí
    private Date createdAt;     // Thời gian khởi tạo tình trạng học phí
    private Date updatedAt;     // Thời gian cập nhật tình trạng học phí
    private String createdBy;   // Người khởi tạo tình trạng học phí

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