package com.example.demo.controller.api;

import com.example.demo.models.Condition;
import com.example.demo.service.ConditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/api/completion")
public class CompletionApiController {

    @Autowired
    private ConditionService conditionService;

    @GetMapping("/{projectId}")
    public String calculateCompletionTime(@PathVariable String projectId) {
        List<Condition> conditions = conditionService.getAllConditions();
        if (conditions.isEmpty()) {
            return "Không có điều kiện nào được ghi nhận cho dự án " + projectId;
        }

        long totalDays = 0;
        for (Condition condition : conditions) {
            if (condition.getCompletionTime() != null) {
                long diff = condition.getCompletionTime().getTime() - condition.getCreatedAt().getTime();
                long days = TimeUnit.MILLISECONDS.toDays(diff);
                totalDays += days;
            }
        }

        Date estimatedCompletionDate = new Date(System.currentTimeMillis() + TimeUnit.DAYS.toMillis(totalDays));

        return "Dự án " + projectId + " dự kiến hoàn thành vào: " + estimatedCompletionDate;
    }
}