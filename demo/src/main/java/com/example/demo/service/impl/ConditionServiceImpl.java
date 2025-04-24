package com.example.demo.service.impl;

import com.example.demo.models.Condition;
import com.example.demo.repository.ConditionRepository;
import com.example.demo.service.ConditionService;
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
    public Condition getConditionById(String id) { // Chuyển từ int sang String
        Optional<Condition> condition = repository.findById(id);
        return condition.orElse(null);
    }

    @Override
    public Condition saveCondition(Condition condition) {
        return repository.save(condition);
    }

    @Override
    public void deleteCondition(String id) { // Chuyển từ int sang String
        repository.deleteById(id);
    }
}