package com.example.demo.repository;

import com.example.demo.models.Condition;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConditionRepository extends MongoRepository<Condition, String> {
}