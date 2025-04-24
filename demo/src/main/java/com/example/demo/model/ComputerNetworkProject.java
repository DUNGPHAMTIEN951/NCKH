package com.example.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "computer_network_project")
public class ComputerNetworkProject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String MSDA;

    @ManyToOne
    @JoinColumn(name = "userAccountId", nullable = false)
    private UserAccount userAccount;

    @ManyToOne
    @JoinColumn(name = "projectStatus", nullable = false)
    private ProjectStatus projectStatus;

    @ManyToOne
    @JoinColumn(name = "tuitionStatus", nullable = false)
    private TuitionStatus tuitionStatus;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    private String createdBy;
    
    // Getters and Setters
}