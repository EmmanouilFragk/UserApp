package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.forms.UserForm;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User editUser(UserForm userForm) {
        User user = userRepository.findUserByEmail(userForm.getEmail());
        user.setFirstName(userForm.getUserFirstName());
        user.setLastName(userForm.getUserLastName());
        user.setEmail(userForm.getEmail());
        user.setPhoneNumber(userForm.getPhoneNumber());
        user.setCompanyName(userForm.getCompanyName());
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(userForm.getPassword());
        user.setPassword(encodedPassword);
        return userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository
                .findAll()
                .stream()
                .collect(Collectors.toList());
    }

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }
}
