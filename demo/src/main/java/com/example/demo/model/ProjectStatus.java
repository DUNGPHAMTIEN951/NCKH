package com.example.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "project_status")
public class ProjectStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private int statusNumber;
    private String statusName;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    private String createdBy;
    
    // Getters and Setters
}