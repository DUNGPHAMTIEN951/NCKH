package com.example.demo.service;

import com.example.demo.models.Condition;
import java.util.List;

public interface ConditionService {
    List<Condition> getAllConditions();
    Condition getConditionById(String id);
    Condition saveCondition(Condition condition);
    Condition updateCondition(String id, Condition condition); // Bổ sung phương thức update
    void deleteCondition(String id);
}