package com.uam.biblioteca.service;

import com.uam.biblioteca.dto.LoginResponse;
import com.uam.biblioteca.model.Users;

public interface IServiceUser {
    LoginResponse getUser(String user, String password);
    public Users save(Users users);
}
