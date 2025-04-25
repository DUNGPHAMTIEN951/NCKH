package com.example.demo.controller.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RoadMapManagerController {

    @GetMapping("/roadmap-manager/details")
    public String roadmapDetails() {
        return "/static/Dashboard/roadmapManager/roadMap-details.html"; // Điều hướng đến trang chi tiết lộ trình
    }

    @GetMapping("/roadmap-manager/list")
    public String roadmapList() {
        return "/static/Dashboard/roadmapManager/roadMaplist.html"; // Điều hướng đến danh sách lộ trình
    }

    @GetMapping("/roadmap-manager/report")
    public String roadmapReport() {
        return "/static/Dashboard/roadmapManager/roadMapreport.html"; // Điều hướng đến báo cáo lộ trình
    }

    @GetMapping("/roadmap-manager/submit-list")
    public String roadmapSubmitList() {
        return "/static/Dashboard/roadmapManager/roadMapSubmittlist.html"; // Điều hướng đến danh sách lộ trình đã nộp
    }

    @GetMapping("/roadmap-manager/submit-lists")
    public String roadmapSubmitLists() {
        return "/static/Dashboard/roadmapManager/roadMapSubmittlists.html"; // Điều hướng đến danh sách mở rộng của lộ trình đã nộp
    }
}