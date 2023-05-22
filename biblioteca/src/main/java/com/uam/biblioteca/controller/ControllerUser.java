package com.uam.biblioteca.controller;

import com.uam.biblioteca.dto.LoginResponse;
import com.uam.biblioteca.model.Users;
import com.uam.biblioteca.service.IServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class ControllerUser {
    @Autowired
    private IServiceUser service;
    @GetMapping("/login")
    public LoginResponse getLogin(@Param("name") String name, @Param("password") String password) {
        return service.getUser(name, password);
    }
    @PostMapping("/save")
    public Users save(Users users) {
        return service.save(users);
    }
}
