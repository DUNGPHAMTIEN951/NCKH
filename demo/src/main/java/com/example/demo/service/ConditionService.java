package com.example.service;

import com.example.models.Condition;
import java.util.List;

public interface ConditionService {
    List<Condition> getAllConditions();
    Condition getConditionById(int id);
    Condition saveCondition(Condition condition);
    void deleteCondition(int id);
}