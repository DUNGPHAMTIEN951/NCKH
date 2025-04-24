package com.example.service.impl;

import com.example.models.Condition;
import com.example.repository.ConditionRepository;
import com.example.service.ConditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ConditionServiceImpl implements ConditionService {

    @Autowired
    private ConditionRepository repository;

    @Override
    public List<Condition> getAllConditions() {
        return repository.findAll();
    }

    @Override
    public Condition getConditionById(int id) {
        Optional<Condition> condition = repository.findById(id);
        return condition.orElse(null);
    }

    @Override
    public Condition saveCondition(Condition condition) {
        return repository.save(condition);
    }

    @Override
    public void deleteCondition(int id) {
        repository.deleteById(id);
    }
}