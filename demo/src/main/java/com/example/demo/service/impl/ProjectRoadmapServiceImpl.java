package com.example.service.impl;

import com.example.models.ProjectRoadmap;
import com.example.repository.ProjectRoadmapRepository;
import com.example.service.ProjectRoadmapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectRoadmapServiceImpl implements ProjectRoadmapService {

    @Autowired
    private ProjectRoadmapRepository repository;

    @Override
    public List<ProjectRoadmap> getAllRoadmaps() {
        return repository.findAll();
    }

    @Override
    public ProjectRoadmap getRoadmapById(int id) {
        Optional<ProjectRoadmap> roadmap = repository.findById(id);
        return roadmap.orElse(null);
    }

    @Override
    public ProjectRoadmap saveRoadmap(ProjectRoadmap roadmap) {
        return repository.save(roadmap);
    }

    @Override
    public void deleteRoadmap(int id) {
        repository.deleteById(id);
    }
}