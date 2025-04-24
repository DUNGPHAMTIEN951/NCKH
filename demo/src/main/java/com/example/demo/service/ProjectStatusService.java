package com.example.demo.service;

import java.util.List;
import com.example.demo.models.ProjectStatus;

public interface ProjectStatusService {
    List<ProjectStatus> getAllStatuses();
    ProjectStatus getStatusById(String id); // Chuyển từ int sang String
    ProjectStatus saveStatus(ProjectStatus status);
    void deleteStatus(String id); // Chuyển từ int sang String
}