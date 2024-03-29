package com.uam.biblioteca.service;

import com.uam.biblioteca.dto.LoginResponse;
import com.uam.biblioteca.model.Users;
import com.uam.biblioteca.repository.IRepositoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceUser implements IServiceUser {
    @Autowired
    private IRepositoryUser repositoryUser;
    @Override
    public LoginResponse getUser(String user, String password) {
        Users u = repositoryUser.getUserByUser(user, password);
        LoginResponse lr = new LoginResponse(false, "Not Connect");
        if(u != null) {
            lr = new LoginResponse(true, "Connected");
        }
        return lr;
    }

    @Override
    public Users save(Users users) {
        return repositoryUser.save(users);
    }
}
