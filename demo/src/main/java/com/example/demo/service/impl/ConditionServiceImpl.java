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
    public Condition getConditionById(String id) {
        Optional<Condition> condition = repository.findById(id);
        return condition.orElse(null);
    }

    @Override
    public Condition saveCondition(Condition condition) {
        return repository.save(condition);
    }

    @Override
    public Condition updateCondition(String id, Condition updatedCondition) {
        Optional<Condition> existingCondition = repository.findById(id);
        if (existingCondition.isPresent()) {
            Condition condition = existingCondition.get();
            condition.setConditionName(updatedCondition.getConditionName()); 
            condition.setCompletionTime(updatedCondition.getCompletionTime()); // Cập nhật thời gian hoàn thành
            condition.setUpdatedAt(updatedCondition.getUpdatedAt()); // Cập nhật thời gian sửa đổi
            condition.setCreatedBy(updatedCondition.getCreatedBy()); // Cập nhật người sửa đổi nếu cần
            return repository.save(condition);
        }
        return null;
    }

    @Override
    public void deleteCondition(String id) {
        repository.deleteById(id);
    }
}