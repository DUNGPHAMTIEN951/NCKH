package com.example.demo.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {

    @GetMapping("/dashboard")
    public String dashboard() {
        return "Dashboard/index.html"; // Trang tổng quan
    }

    @GetMapping("/projects")
    public String studentProjects() {
        return "projects"; // Quản lý đồ án của sinh viên
    }

    @GetMapping("/project-info")
    public String projectInfo() {
        return "project_info"; // Quản lý thông tin đồ án
    }

    @GetMapping("/users")
    public String userManagement() {
        return "users"; // Quản lý tài khoản người dùng
    }

    @GetMapping("/roadmaps")
    public String roadmapManagement() {
        return "roadmaps"; // Quản lý lộ trình
    }

    @GetMapping("/tuition")
    public String tuitionStatus() {
        return "tuition"; // Quản lý tình trạng học phí
    }

    @GetMapping("/completion")
    public String completionTime() {
        return "completion"; // Quản lý thời gian hoàn thành
    }
}