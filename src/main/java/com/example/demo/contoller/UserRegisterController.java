package com.example.demo.contoller;

import com.example.demo.domain.User;
import com.example.demo.forms.UserRegisterForm;
import com.example.demo.mappers.UserRegisterFormToUserMapper;
import com.example.demo.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

import static javax.servlet.RequestDispatcher.ERROR_MESSAGE;

@Controller
public class UserRegisterController {

    private static final String REGISTER_FORM = "userRegisterForm";

    @Autowired
    private UserServiceImpl userServiceImpl;

    @Autowired
    UserRegisterFormToUserMapper mapper;

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute(REGISTER_FORM,
                new UserRegisterForm());
        return "UserRegister";
    }

    @PostMapping(value = "/login")
    public String createUser(Model model, @Valid @ModelAttribute(REGISTER_FORM) UserRegisterForm userRegisterForm, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            model.addAttribute(ERROR_MESSAGE, "an error occurred");
            //return String.format("/owners/%s/edit", ownerForm.getId());

            return "UserRegister";
        } try {
            User user = mapper.user(userRegisterForm);
            userServiceImpl.createUser(user);
            return "Login";
        } catch (Exception Ex) {
            model.addAttribute(REGISTER_FORM, userRegisterForm);
            model.addAttribute("errorMessage", "Registration could not be complete. Email cannot be duplicate.");
            return "UserRegister";
        }
    }
}
