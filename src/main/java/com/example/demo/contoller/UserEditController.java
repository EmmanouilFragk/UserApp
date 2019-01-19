package com.example.demo.contoller;

import com.example.demo.domain.User;
import com.example.demo.forms.UserForm;
import com.example.demo.mappers.UserToUserFormMapper;
import com.example.demo.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

import static javax.servlet.RequestDispatcher.ERROR_MESSAGE;

@Controller
@RequestMapping("/user")
public class UserEditController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @Autowired
    private UserToUserFormMapper userToUserFormMapper;

    @GetMapping(value = "/edit")
    public String editOwner (Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User user = userServiceImpl.findUserByEmail(authentication.getName());
        model.addAttribute("userForm", userToUserFormMapper.convertUserToUserForm(user));
        return "UserEdit";
    }

    @PostMapping(value = "/edit")
    public String updateOwner(Model model, @Valid @ModelAttribute("userForm") UserForm userForm, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            model.addAttribute(ERROR_MESSAGE, "an error occurred");
            //return String.format("/owners/%s/edit", ownerForm.getId());

            return "UserEdit";
        }

        try {
            userServiceImpl.editUser(userForm);

        } catch (Exception expeption) {

        }

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User user = userServiceImpl.findUserByEmail(authentication.getName());
        model.addAttribute("userForm", userToUserFormMapper.convertUserToUserForm(user));

        return "UserEdit";
    }
}
