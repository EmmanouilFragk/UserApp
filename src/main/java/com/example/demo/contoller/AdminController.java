package com.example.demo.contoller;


import com.example.demo.domain.User;
import com.example.demo.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AdminController {

    private static final String USER_ATTR = "users";

    @Autowired
    private UserServiceImpl userServiceImpl;

    @GetMapping("/admin/home")
    public String adminHome(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        List<User> users = userServiceImpl.findAll();
        model.addAttribute(USER_ATTR, users);

        return "AdminHome";
    }
}
