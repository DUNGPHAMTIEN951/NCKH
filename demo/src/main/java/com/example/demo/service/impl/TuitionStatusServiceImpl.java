package com.example.service.impl;

import com.example.models.TuitionStatus;
import com.example.repository.TuitionStatusRepository;
import com.example.service.TuitionStatusService;
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
    public TuitionStatus getTuitionStatusById(int id) {
        Optional<TuitionStatus> status = repository.findById(id);
        return status.orElse(null);
    }

    @Override
    public TuitionStatus saveTuitionStatus(TuitionStatus status) {
        return repository.save(status);
    }

    @Override
    public void deleteTuitionStatus(int id) {
        repository.deleteById(id);
    }
}