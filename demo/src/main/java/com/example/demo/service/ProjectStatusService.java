package com.example.service;

import com.example.models.ProjectStatus;
import java.util.List;

public interface ProjectStatusService {
    List<ProjectStatus> getAllStatuses();
    ProjectStatus getStatusById(int id);
    ProjectStatus saveStatus(ProjectStatus status);
    void deleteStatus(int id);
}