package com.example.demo.service;

import java.util.List;
import com.example.demo.models.TuitionStatus;

public interface TuitionStatusService {
    List<TuitionStatus> getAllTuitionStatuses();
    TuitionStatus getTuitionStatusById(String id); // Chuyển từ int sang String
    TuitionStatus saveTuitionStatus(TuitionStatus status);
    void deleteTuitionStatus(String id); // Chuyển từ int sang String
}