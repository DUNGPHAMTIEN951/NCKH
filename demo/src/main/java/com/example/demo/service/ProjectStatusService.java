package com.example.demo.service;

import java.util.List;
import com.example.demo.models.ProjectStatus;

public interface ProjectStatusService {
    List<ProjectStatus> getAllStatuses();
    ProjectStatus getStatusById(String id);
    ProjectStatus saveStatus(ProjectStatus status);
    ProjectStatus updateStatus(String id, ProjectStatus status); // Bổ sung phương thức update
    void deleteStatus(String id);
}