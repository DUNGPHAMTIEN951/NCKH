package com.example.service;

import com.example.models.TuitionStatus;
import java.util.List;

public interface TuitionStatusService {
    List<TuitionStatus> getAllTuitionStatuses();
    TuitionStatus getTuitionStatusById(int id);
    TuitionStatus saveTuitionStatus(TuitionStatus status);
    void deleteTuitionStatus(int id);
}