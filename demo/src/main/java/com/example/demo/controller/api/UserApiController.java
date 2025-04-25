package com.example.demo.controller.api;

import com.example.demo.models.UserAccount;
import com.example.demo.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserApiController {

    @Autowired
    private UserAccountService userAccountService;

    @GetMapping
    public List<UserAccount> getAllUsers() {
        return userAccountService.getAllUsers();
    }

    @PostMapping
    public UserAccount createUser(@RequestBody UserAccount user) {
        return userAccountService.saveUser(user);
    }

    @PutMapping("/{id}")
    public UserAccount updateUser(@PathVariable String id, @RequestBody UserAccount user) {
        return userAccountService.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id) {
        userAccountService.deleteUser(id);
    }
}