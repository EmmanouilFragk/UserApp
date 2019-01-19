package com.example.demo.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

@Component
public class LoginSucessHandler extends SavedRequestAwareAuthenticationSuccessHandler {

    private static final String TIMESTAMP_COOKIE_NAME = "TIMESTAMP";
    private String ADMIN_SUCCESS_URL = "/admin/home";
    private String USER_SUCCESS_URL = "/user/home/";

    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {

        boolean isAdmin = checkIfUserIsAdmin(authentication);
        if (isAdmin) {
            redirectToSuccessUrl(request, response, ADMIN_SUCCESS_URL);
        } else {
            redirectToSuccessUrl(request, response, USER_SUCCESS_URL);
        }

    }

    private void redirectToSuccessUrl(HttpServletRequest request, HttpServletResponse response, String success_url) throws IOException {
        RedirectStrategy redirectStrategy = super.getRedirectStrategy();
        redirectStrategy.sendRedirect(request, response, success_url);
    }


    private boolean checkIfUserIsAdmin(Authentication authentication) {
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        for (GrantedAuthority authority : authorities) {
            if (authority.getAuthority().equalsIgnoreCase("ADMIN")) {
                return true;
            }
        }
        return false;
    }
}