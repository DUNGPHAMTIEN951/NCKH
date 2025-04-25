package com.example.demo.controller.web.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/user")
    public String userHome() {
        return "/static/User/index.html"; // Điều hướng đến trang chính của người dùng
    }

    @GetMapping("/user/portfolio")
    public String userPortfolio() {
        return "/static/User/portfolio-details.html"; // Điều hướng đến trang chi tiết hồ sơ người dùng
    }

    @GetMapping("/user/start")
    public String userStartPage() {
        return "/static/User/sarter-page.html"; // Điều hướng đến trang khởi động
    }

    @GetMapping("/user/service-details")
    public String userServiceDetails() {
        return "/static/User/service-details.html"; // Điều hướng đến chi tiết dịch vụ
    }
}