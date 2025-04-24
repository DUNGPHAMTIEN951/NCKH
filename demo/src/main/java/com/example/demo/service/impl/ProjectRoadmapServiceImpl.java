package com.example.demo.service.impl;

import com.example.demo.models.ProjectRoadmap;
import com.example.demo.repository.ProjectRoadmapRepository;
import com.example.demo.service.ProjectRoadmapService;
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
    public ProjectRoadmap getRoadmapById(String id) { // Chuyển từ int sang String
        Optional<ProjectRoadmap> roadmap = repository.findById(id);
        return roadmap.orElse(null);
    }

    @Override
    public ProjectRoadmap saveRoadmap(ProjectRoadmap roadmap) {
        return repository.save(roadmap);
    }

    @Override
    public void deleteRoadmap(String id) { // Chuyển từ int sang String
        repository.deleteById(id);
    }
}