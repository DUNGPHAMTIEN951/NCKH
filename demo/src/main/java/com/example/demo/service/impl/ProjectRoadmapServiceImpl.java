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
    public ProjectRoadmap getRoadmapById(String id) {
        Optional<ProjectRoadmap> roadmap = repository.findById(id);
        return roadmap.orElse(null);
    }

    @Override
    public ProjectRoadmap saveRoadmap(ProjectRoadmap roadmap) {
        return repository.save(roadmap);
    }

    @Override
    public ProjectRoadmap updateRoadmap(String id, ProjectRoadmap updatedRoadmap) {
        Optional<ProjectRoadmap> existingRoadmap = repository.findById(id);
        if (existingRoadmap.isPresent()) {
            ProjectRoadmap roadmap = existingRoadmap.get();
            roadmap.setConditionId(updatedRoadmap.getConditionId());
            roadmap.setEstimatedCompletionTime(updatedRoadmap.getEstimatedCompletionTime());
            roadmap.setUpdatedAt(updatedRoadmap.getUpdatedAt());
            roadmap.setCreatedBy(updatedRoadmap.getCreatedBy());
            return repository.save(roadmap);
        }
        return null;
    }

    @Override
    public void deleteRoadmap(String id) {
        repository.deleteById(id);
    }
}