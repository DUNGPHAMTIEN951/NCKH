package com.example.demo.controller.api;

import com.example.demo.models.TuitionStatus;
import com.example.demo.service.TuitionStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tuition")
public class TuitionApiController {

    @Autowired
    private TuitionStatusService tuitionStatusService;

    @GetMapping
    public List<TuitionStatus> getAllTuitionStatuses() {
        return tuitionStatusService.getAllTuitionStatuses();
    }

    @PostMapping
    public TuitionStatus updateTuitionStatus(@RequestBody TuitionStatus status) {
        return tuitionStatusService.saveTuitionStatus(status);
    }
}