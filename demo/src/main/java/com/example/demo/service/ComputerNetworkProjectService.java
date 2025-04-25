package com.example.demo.service;

import java.util.List;

import com.example.demo.models.ComputerNetworkProject;

public interface ComputerNetworkProjectService {
    List<ComputerNetworkProject> getAllProjects();
    ComputerNetworkProject getProjectById(String id);  
    ComputerNetworkProject saveProject(ComputerNetworkProject project); 
    ComputerNetworkProject updateProject(String id, ComputerNetworkProject project); // Bổ sung phương thức update
    void deleteProject(String id);  
}