package com.example.demo.controller.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectManagerController {

    @GetMapping("/project-manager/add")
    public String addProject() {
        return "/static/Dashboard/projectManager/addProject.html"; // Điều hướng đến trang thêm dự án
    }

    @GetMapping("/project-manager/list")
    public String projectList() {
        return "/static/Dashboard/projectManager/projectList.html"; // Điều hướng đến danh sách dự án
    }

    @GetMapping("/project-manager/report")
    public String projectReport() {
        return "/static/Dashboard/projectManager/projectReport.html"; // Điều hướng đến báo cáo dự án
    }

    @GetMapping("/project-manager/submit-list")
    public String projectSubmitList() {
        return "/static/Dashboard/projectManager/projectSubmitlist.html"; // Điều hướng đến danh sách dự án đã nộp
    }
}