package com.example.demo.controller.api;

import com.example.demo.models.ComputerNetworkProject;
import com.example.demo.service.ComputerNetworkProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/computer-network-projects")
public class ComputerNetworkProjectApiController {

    @Autowired
    private ComputerNetworkProjectService projectService;

    @GetMapping
    public List<ComputerNetworkProject> getAllProjects() {
        return projectService.getAllProjects();
    }

    @PostMapping
    public ComputerNetworkProject createProject(@RequestBody ComputerNetworkProject project) {
        return projectService.saveProject(project);
    }

    @PutMapping("/{id}")
    public ComputerNetworkProject updateProject(@PathVariable String id, @RequestBody ComputerNetworkProject project) {
        return projectService.updateProject(id, project);
    }

    @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable String id) {
        projectService.deleteProject(id);
    }
}