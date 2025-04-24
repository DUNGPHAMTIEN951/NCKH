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
    public TuitionStatus getTuitionStatusById(String id) { // Chuyển từ int sang String
        Optional<TuitionStatus> status = repository.findById(id);
        return status.orElse(null);
    }

    @Override
    public TuitionStatus saveTuitionStatus(TuitionStatus status) {
        return repository.save(status);
    }

    @Override
    public void deleteTuitionStatus(String id) { // Chuyển từ int sang String
        repository.deleteById(id);
    }
}