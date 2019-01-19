package com.example.demo.service;

import com.example.demo.domain.User;

import javax.naming.AuthenticationException;

public interface LoginService {

    User login(String email, String password) throws AuthenticationException;

    void logout(String email) throws Exception;

}
