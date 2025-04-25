package com.example.demo.controller.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserAccountManagerController {

    @GetMapping("/user-account-manager/new")
    public String createUser() {
        return "/static/Dashboard/userAccountManager/newuser.html"; // Điều hướng đến trang thêm tài khoản
    }

    @GetMapping("/user-account-manager/list")
    public String userList() {
        return "/static/Dashboard/userAccountManager/userlists.html"; // Điều hướng đến danh sách tài khoản người dùng
    }
}