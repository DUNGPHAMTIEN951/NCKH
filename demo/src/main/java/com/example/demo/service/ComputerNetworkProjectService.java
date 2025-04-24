package com.example.service;

import com.example.models.ComputerNetworkProject;
import java.util.List;

public interface ComputerNetworkProjectService {
    List<ComputerNetworkProject> getAllProjects();
    ComputerNetworkProject getProjectById(int id);
    ComputerNetworkProject saveProject(ComputerNetworkProject project);
    void deleteProject(int id);
}