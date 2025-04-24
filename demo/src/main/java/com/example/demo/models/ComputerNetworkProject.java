package com.example.demo.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "computer_network_project") // Định danh MongoDB Collection
public class ComputerNetworkProject {

    @Id
    private String id; // MongoDB dùng String ID thay vì int

    private String MSDA;
    private String userAccountId; // Lưu ID thay vì dùng @ManyToOne
    private String projectStatusId;
    private String tuitionStatusId;

    private Date createdAt;
    private Date updatedAt;
    private String createdBy;

    // Getters & Setters

    public String getId() {
        return id;
    }

    public String getMSDA() {
        return MSDA;
    }

    public String getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(String userAccountId) {
        this.userAccountId = userAccountId;
    }

    public String getProjectStatusId() {
        return projectStatusId;
    }

    public void setProjectStatusId(String projectStatusId) {
        this.projectStatusId = projectStatusId;
    }

    public String getTuitionStatusId() {
        return tuitionStatusId;
    }

    public void setTuitionStatusId(String tuitionStatusId) {
        this.tuitionStatusId = tuitionStatusId;
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