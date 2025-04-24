package com.example.service;

import com.example.models.ProjectRoadmap;
import java.util.List;

public interface ProjectRoadmapService {
    List<ProjectRoadmap> getAllRoadmaps();
    ProjectRoadmap getRoadmapById(int id);
    ProjectRoadmap saveRoadmap(ProjectRoadmap roadmap);
    void deleteRoadmap(int id);
}