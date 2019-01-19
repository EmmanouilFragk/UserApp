package com.example.demo.springsecurity;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

@Component
public class LoginSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

    private String ADMIN_SUCCESS_URL = "/Admin/Home";
    private String DEFAULT_SUCCESS_URL = "/User/Home";

    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {

        boolean isAdmin = checkIfUserIsAdmin(authentication);
        if (isAdmin) {
            redirectToSuccessUrl(request, response, ADMIN_SUCCESS_URL);
        } else {
            redirectToSuccessUrl(request, response, DEFAULT_SUCCESS_URL);
        }

    }

    private void redirectToSuccessUrl(HttpServletRequest request, HttpServletResponse response, String success_url) throws IOException {
        RedirectStrategy redirectStrategy = super.getRedirectStrategy();
        redirectStrategy.sendRedirect(request, response, success_url);
    }


    private boolean checkIfUserIsAdmin(Authentication authentication) {
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        for (GrantedAuthority authority : authorities) {
            if (authority.getAuthority().equalsIgnoreCase("Admin")) {
                return true;
            }
        }
        return false;
    }
}
