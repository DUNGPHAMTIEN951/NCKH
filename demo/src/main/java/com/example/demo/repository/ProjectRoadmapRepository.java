package com.example.repository;

import com.example.models.ProjectRoadmap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRoadmapRepository extends JpaRepository<ProjectRoadmap, Integer> {
}