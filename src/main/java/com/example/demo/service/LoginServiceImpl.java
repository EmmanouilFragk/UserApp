package com.example.demo.service;


import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.AuthenticationException;
import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public class LoginServiceImpl implements LoginService{

    private final static org.slf4j.Logger LOG = LoggerFactory.getLogger(LoginServiceImpl.class);
    private ArrayList<String> loggedIn = new ArrayList<String>();

    @Autowired
    private UserRepository userRepository;


    @Override
    public User login(String email, String password) throws AuthenticationException {
        User logUser = userRepository.findUserByEmailAndPassword(email,password);
        if (logUser == null) {
            //throw new InvalidUserException("User not found!");
        }

        loggedIn.add(email);
        return logUser;
    }

    @Override
    public void logout(String email) throws Exception {
        loggedIn.remove(email);
    }
}
