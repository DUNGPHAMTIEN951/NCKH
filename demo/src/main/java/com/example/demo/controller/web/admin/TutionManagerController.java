package com.example.demo.controller.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TutionManagerController {

    @GetMapping("/tution-manager/create")
    public String createTution() {
        return "/static/Dashboard/tutionManager/createTution.html"; // Điều hướng đến trang tạo tình trạng học phí
    }

    @GetMapping("/tution-manager/category")
    public String tutionCategory() {
        return "/static/Dashboard/tutionManager/tutionCategory.html"; // Điều hướng đến trang danh mục học phí
    }

    @GetMapping("/tution-manager/list")
    public String tutionList() {
        return "/static/Dashboard/tutionManager/tutionList.html"; // Điều hướng đến trang danh sách học phí
    }
}