package com.example.demo.service.impl;

import com.example.demo.models.TuitionStatus;
import com.example.demo.repository.TuitionStatusRepository;
import com.example.demo.service.TuitionStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TuitionStatusServiceImpl implements TuitionStatusService {

    @Autowired
    private TuitionStatusRepository repository;

    @Override
    public List<TuitionStatus> getAllTuitionStatuses() {
        return repository.findAll();
    }

    @Override
    public TuitionStatus getTuitionStatusById(String id) {
        Optional<TuitionStatus> status = repository.findById(id);
        return status.orElse(null);
    }

    @Override
    public TuitionStatus saveTuitionStatus(TuitionStatus status) {
        return repository.save(status);
    }

    @Override
    public TuitionStatus updateTuitionStatus(String id, TuitionStatus updatedStatus) {
        Optional<TuitionStatus> existingStatus = repository.findById(id);
        if (existingStatus.isPresent()) {
            TuitionStatus status = existingStatus.get();
            status.setStatusNumber(updatedStatus.getStatusNumber());
            status.setStatusName(updatedStatus.getStatusName());
            status.setUpdatedAt(updatedStatus.getUpdatedAt());
            status.setCreatedBy(updatedStatus.getCreatedBy());
            return repository.save(status);
        }
        return null;
    }

    @Override
    public void deleteTuitionStatus(String id) {
        repository.deleteById(id);
    }
}