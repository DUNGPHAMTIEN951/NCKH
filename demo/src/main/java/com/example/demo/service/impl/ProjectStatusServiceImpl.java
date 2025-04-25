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
    public ProjectStatus getStatusById(String id) {
        Optional<ProjectStatus> status = repository.findById(id);
        return status.orElse(null);
    }

    @Override
    public ProjectStatus saveStatus(ProjectStatus status) {
        return repository.save(status);
    }

    @Override
    public ProjectStatus updateStatus(String id, ProjectStatus updatedStatus) {
        Optional<ProjectStatus> existingStatus = repository.findById(id);
        if (existingStatus.isPresent()) {
            ProjectStatus status = existingStatus.get();
            status.setStatusNumber(updatedStatus.getStatusNumber());
            status.setStatusName(updatedStatus.getStatusName());
            status.setUpdatedAt(updatedStatus.getUpdatedAt());
            status.setCreatedBy(updatedStatus.getCreatedBy());
            return repository.save(status);
        }
        return null;
    }

    @Override
    public void deleteStatus(String id) {
        repository.deleteById(id);
    }
}