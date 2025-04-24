package com.example.repository;

import com.example.models.ComputerNetworkProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputerNetworkProjectRepository extends JpaRepository<ComputerNetworkProject, Integer> {
}