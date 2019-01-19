package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.forms.UserForm;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User editUser(UserForm userForm);
    List<User> findAll();
    User findUserByEmail(String email);
}
