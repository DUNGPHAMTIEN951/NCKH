package com.example.demo.controller.api;

import com.example.demo.models.ProjectRoadmap;
import com.example.demo.service.ProjectRoadmapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roadmaps")
public class RoadmapController {

    @Autowired
    private ProjectRoadmapService roadmapService;

    @GetMapping
    public List<ProjectRoadmap> getAllRoadmaps() {
        return roadmapService.getAllRoadmaps();
    }

    @PostMapping
    public ProjectRoadmap createRoadmap(@RequestBody ProjectRoadmap roadmap) {
        return roadmapService.saveRoadmap(roadmap);
    }

    @PutMapping("/{id}")
    public ProjectRoadmap updateRoadmap(@PathVariable String id, @RequestBody ProjectRoadmap roadmap) {
        return roadmapService.updateRoadmap(id, roadmap);
    }

    @DeleteMapping("/{id}")
    public void deleteRoadmap(@PathVariable String id) {
        roadmapService.deleteRoadmap(id);
    }
}