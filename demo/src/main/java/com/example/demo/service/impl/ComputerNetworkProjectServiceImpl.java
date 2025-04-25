package com.example.demo.service.impl;

import com.example.demo.models.ComputerNetworkProject;
import com.example.demo.repository.ComputerNetworkProjectRepository;
import com.example.demo.service.ComputerNetworkProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ComputerNetworkProjectServiceImpl implements ComputerNetworkProjectService {

    @Autowired
    private ComputerNetworkProjectRepository repository;

    @Override
    public List<ComputerNetworkProject> getAllProjects() {
        return repository.findAll();
    }

    @Override
    public ComputerNetworkProject getProjectById(String id) {
        Optional<ComputerNetworkProject> project = repository.findById(id);
        return project.orElse(null);
    }

    @Override
    public ComputerNetworkProject saveProject(ComputerNetworkProject project) {
        return repository.save(project);
    }

    @Override
    public ComputerNetworkProject updateProject(String id, ComputerNetworkProject updatedProject) {
        Optional<ComputerNetworkProject> existingProject = repository.findById(id);
        if (existingProject.isPresent()) {
            ComputerNetworkProject project = existingProject.get();
            project.setProjectCode(updatedProject.getProjectCode());
            project.setAccountId(updatedProject.getAccountId());
            project.setProjectStatus(updatedProject.getProjectStatus());
            project.setTuitionStatus(updatedProject.getTuitionStatus());
            project.setUpdatedAt(updatedProject.getUpdatedAt());
            project.setCreatedBy(updatedProject.getCreatedBy());
            return repository.save(project);
        }
        return null;
    }

    @Override
    public void deleteProject(String id) {
        repository.deleteById(id);
    }
}