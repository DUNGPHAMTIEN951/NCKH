package com.example.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "condition")
public class Condition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String conditionName;

    @Temporal(TemporalType.TIMESTAMP)
    private Date completionTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    private String createdBy;

    // Getters and Setters
}