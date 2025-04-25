package com.example.demo.service;

import java.util.List;
import com.example.demo.models.ProjectRoadmap;

public interface ProjectRoadmapService {
    List<ProjectRoadmap> getAllRoadmaps();
    ProjectRoadmap getRoadmapById(String id);
    ProjectRoadmap saveRoadmap(ProjectRoadmap roadmap);
    ProjectRoadmap updateRoadmap(String id, ProjectRoadmap roadmap); // Bổ sung phương thức update
    void deleteRoadmap(String id);
}