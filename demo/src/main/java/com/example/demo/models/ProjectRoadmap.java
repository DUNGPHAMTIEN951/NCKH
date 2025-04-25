package com.example.demo.models;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "project_roadmap") // Định danh MongoDB Collection
public class ProjectRoadmap {

    @Id
    private String id; // Khóa chính

    private String conditionId;  // Điều kiện liên quan đến lộ trình thực hiện dự án
    private Date estimatedCompletionTime; // Thời gian hoàn thành dự án dự kiến
    private Date createdAt;      // Thời gian khởi tạo lộ trình
    private Date updatedAt;      // Thời gian cập nhật lộ trình
    private String createdBy;    // Người khởi tạo lộ trình

    // Getters & Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getConditionId() {
        return conditionId;
    }

    public void setConditionId(String conditionId) {
        this.conditionId = conditionId;
    }

    public Date getEstimatedCompletionTime() {
        return estimatedCompletionTime;
    }

    public void setEstimatedCompletionTime(Date estimatedCompletionTime) {
        this.estimatedCompletionTime = estimatedCompletionTime;
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