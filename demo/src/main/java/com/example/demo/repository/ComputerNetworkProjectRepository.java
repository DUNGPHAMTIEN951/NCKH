package com.example.demo.repository;

import com.example.demo.models.ComputerNetworkProject;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputerNetworkProjectRepository extends MongoRepository<ComputerNetworkProject, String> {
}