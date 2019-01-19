package com.example.demo.contoller;

import com.example.demo.domain.User;
import com.example.demo.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserHomeController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @GetMapping("/user/home")
    public String userHome(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        User user = userServiceImpl.findUserByEmail(authentication.getName());
        model.addAttribute("user", user);

        return "UserHome";
    }
}
