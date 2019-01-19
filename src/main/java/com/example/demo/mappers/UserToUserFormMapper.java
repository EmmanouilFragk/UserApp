package com.example.demo.mappers;

import com.example.demo.domain.User;
import com.example.demo.forms.UserForm;
import org.springframework.stereotype.Component;

@Component
public class UserToUserFormMapper {
    public UserForm convertUserToUserForm (User user) {
        return new UserForm(user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getPhoneNumber(),
                user.getCompanyName(),
                user.getPassword());
    }
}
