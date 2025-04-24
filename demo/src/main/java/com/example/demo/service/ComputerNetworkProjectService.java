package com.example.demo.service;

import java.util.List;
import com.example.demo.models.ComputerNetworkProject;

public interface ComputerNetworkProjectService {
    List<ComputerNetworkProject> getAllProjects();
    ComputerNetworkProject getProjectById(String id); // Chuyển từ int sang String
    ComputerNetworkProject saveProject(ComputerNetworkProject project);
    void deleteProject(String id); // Chuyển từ int sang String
}