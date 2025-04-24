package com.example.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "project_roadmap")
public class ProjectRoadmap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "conditionId", nullable = false)
    private Condition condition;

    @Temporal(TemporalType.TIMESTAMP)
    private Date estimatedCompletionTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    private String createdBy;

    // Getters and Setters
}