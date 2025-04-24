package com.example.demo.service.impl;

import com.example.demo.models.ProjectStatus;
import com.example.demo.repository.ProjectStatusRepository;
import com.example.demo.service.ProjectStatusService;
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
    public ProjectStatus getStatusById(String id) { // Chuyển từ int sang String
        Optional<ProjectStatus> status = repository.findById(id);
        return status.orElse(null);
    }

    @Override
    public ProjectStatus saveStatus(ProjectStatus status) {
        return repository.save(status);
    }

    @Override
    public void deleteStatus(String id) { // Chuyển từ int sang String
        repository.deleteById(id);
    }
}