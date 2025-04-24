package com.example.demo.repository;

import com.example.demo.models.TuitionStatus;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TuitionStatusRepository extends MongoRepository<TuitionStatus, String> {
}