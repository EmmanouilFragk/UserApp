package com.example.demo.contoller;

import com.example.demo.forms.LoginForm;
import com.example.demo.service.LoginServiceImpl;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LogInController {

    private static final String LOGIN_FORM = "loginForm";
    private final static org.slf4j.Logger LOG = LoggerFactory.getLogger(LoginServiceImpl.class);


    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(Model model,
                        @RequestParam(name = "error", required = false) String error,
                        HttpSession session) {

        if (error != null) {
            LOG.error("User not found!");
            model.addAttribute("errorMessage", "User not found! Please try again");
        }
        model.addAttribute(LOGIN_FORM, new LoginForm());

        return "Login";
    }
}
