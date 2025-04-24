package com.example.demo.service;

import java.util.List;
import com.example.demo.models.ProjectRoadmap;

public interface ProjectRoadmapService {
    List<ProjectRoadmap> getAllRoadmaps();
    ProjectRoadmap getRoadmapById(String id); // Chuyển từ int sang String
    ProjectRoadmap saveRoadmap(ProjectRoadmap roadmap);
    void deleteRoadmap(String id); // Chuyển từ int sang String
}