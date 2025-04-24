package com.example.demo.service;

import com.example.demo.models.Condition;
import java.util.List;

public interface ConditionService {
    List<Condition> getAllConditions();
    Condition getConditionById(String id); // Chuyển từ int sang String
    Condition saveCondition(Condition condition);
    void deleteCondition(String id); // Chuyển từ int sang String
}