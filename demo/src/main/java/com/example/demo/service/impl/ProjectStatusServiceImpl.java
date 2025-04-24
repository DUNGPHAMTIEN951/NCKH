package com.example.service.impl;

import com.example.models.ProjectStatus;
import com.example.repository.ProjectStatusRepository;
import com.example.service.ProjectStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectStatusServiceImpl implements ProjectStatusService {

    @Autowired
    private ProjectStatusRepository repository;

    @Override
    public List<ProjectStatus> getAllStatuses() {
        return repository.findAll();
    }

    @Override
    public ProjectStatus getStatusById(int id) {
        Optional<ProjectStatus> status = repository.findById(id);
        return status.orElse(null);
    }

    @Override
    public ProjectStatus saveStatus(ProjectStatus status) {
        return repository.save(status);
    }

    @Override
    public void deleteStatus(int id) {
        repository.deleteById(id);
    }
}