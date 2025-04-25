package com.example.demo.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NetworkProjectController {

    @GetMapping("/network-projects/add")
    public String addNetworkProject() {
        return "/static/networkproject/addNetworkProject.html"; // Điều hướng đến trang thêm dự án
    }

    @GetMapping("/network-projects/import")
    public String importNetworkProject() {
        return "/static/networkproject/importNetworkProject.html"; // Điều hướng đến trang nhập dự án
    }

    @GetMapping("/network-projects/details")
    public String networkProjectDetails() {
        return "/static/networkproject/networkProject-details.html"; // Điều hướng đến trang chi tiết dự án
    }

    @GetMapping("/network-projects/list")
    public String networkProjectList() {
        return "/static/networkproject/networkProjectlist.html"; // Điều hướng đến danh sách dự án
    }
}