package com.example.demo.service;

import java.util.List;
import com.example.demo.models.TuitionStatus;

public interface TuitionStatusService {
    List<TuitionStatus> getAllTuitionStatuses();
    TuitionStatus getTuitionStatusById(String id);
    TuitionStatus saveTuitionStatus(TuitionStatus status);
    TuitionStatus updateTuitionStatus(String id, TuitionStatus status); 
    void deleteTuitionStatus(String id);
}