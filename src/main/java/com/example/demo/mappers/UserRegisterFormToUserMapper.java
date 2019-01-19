package com.example.demo.mappers;

import com.example.demo.domain.User;
import com.example.demo.forms.UserRegisterForm;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Component
public class UserRegisterFormToUserMapper {

    public User user (UserRegisterForm userRegisterForm){
        User user = new User();
        user.setFirstName(userRegisterForm.getUserFirstName());
        user.setLastName(userRegisterForm.getUserLastName());
        user.setEmail(userRegisterForm.getEmail());
        user.setPhoneNumber(userRegisterForm.getPhoneNumber());
        user.setCompanyName(userRegisterForm.getCompanyName());
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(userRegisterForm.getPassword());
        user.setPassword(encodedPassword);
        user.setUserType(userRegisterForm.getUserType());
        return user;
    }
}
