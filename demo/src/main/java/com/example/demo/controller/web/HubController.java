package com.example.demo.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HubController {

    @GetMapping("/hub")
    public String hubIndex() {
        return "/static/hub/index.html"; // Điều hướng đến trang chính của Hub
    }

    @GetMapping("/hub/activities")
    public String hubActivities() {
        return "/static/hub/activities.html"; // Điều hướng đến trang hoạt động người dùng
    }

    @GetMapping("/hub/settings")
    public String hubSettings() {
        return "/static/hub/generalsettings.html"; // Điều hướng đến trang cài đặt chung
    }

    @GetMapping("/hub/profile")
    public String hubProfile() {
        return "/static/hub/profile.html"; // Điều hướng đến hồ sơ cá nhân
    }

    @GetMapping("/hub/signin")
    public String hubSignin() {
        return "/static/hub/signin.html"; // Điều hướng đến trang đăng nhập
    }

    @GetMapping("/hub/signup")
    public String hubSignup() {
        return "/static/hub/signup.html"; // Điều hướng đến trang đăng ký
    }
}