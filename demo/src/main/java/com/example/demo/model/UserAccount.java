package com.example.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user_account")
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String studentId;
    private String fullName;

    @ManyToOne
    @JoinColumn(name = "userRoleId", nullable = false)
    private UserRole userRole;

    private String faculty;
    private String className;
    private String profileImage;
    private String email;
    private String phoneNumber;
    private Date dateOfBirth;
    private String gender;
    private String username;
    private String password;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    private String createdBy;

    // Getters and Setters
}