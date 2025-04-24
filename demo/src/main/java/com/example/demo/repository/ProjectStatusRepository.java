package com.example.demo.repository;

import com.example.demo.models.ProjectStatus;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectStatusRepository extends MongoRepository<ProjectStatus, String> {
}