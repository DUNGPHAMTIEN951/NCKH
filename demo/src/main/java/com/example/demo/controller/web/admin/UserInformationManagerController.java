package com.example.demo.controller.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserInformationManagerController {

    @GetMapping("/user-info/giang-vien/add")
    public String addGiangVien() {
        return "/static/Dashboard/userInformationManager/GiangVien/addUser.html"; // Điều hướng đến trang thêm thông tin giảng viên
    }

    @GetMapping("/user-info/giang-vien/list")
    public String listGiangVien() {
        return "/static/Dashboard/userInformationManager/GiangVien/Userlist.html"; // Điều hướng đến danh sách giảng viên
    }

    @GetMapping("/user-info/phong-dao-tao/add")
    public String addPhongDaoTao() {
        return "/static/Dashboard/userInformationManager/PhongDaoTaoDaiHoc/addUser.html"; // Điều hướng đến trang thêm nhân sự phòng đào tạo
    }

    @GetMapping("/user-info/phong-dao-tao/list")
    public String listPhongDaoTao() {
        return "/static/Dashboard/userInformationManager/PhongDaoTaoDaiHoc/Userlist.html"; // Điều hướng đến danh sách phòng đào tạo
    }

    @GetMapping("/user-info/phong-tai-chinh/add")
    public String addPhongTaiChinh() {
        return "/static/Dashboard/userInformationManager/PhongKeHoachTaiChinh/addUser.html"; // Điều hướng đến trang thêm nhân sự tài chính
    }

    @GetMapping("/user-info/phong-tai-chinh/list")
    public String listPhongTaiChinh() {
        return "/static/Dashboard/userInformationManager/PhongKeHoachTaiChinh/Userlist.html"; // Điều hướng đến danh sách phòng tài chính
    }

    @GetMapping("/user-info/students/add")
    public String addStudent() {
        return "/static/Dashboard/userInformationManager/Students/addUser.html"; // Điều hướng đến trang thêm sinh viên
    }

    @GetMapping("/user-info/students/list")
    public String listStudents() {
        return "/static/Dashboard/userInformationManager/Students/userlist.html"; // Điều hướng đến danh sách sinh viên
    }
}