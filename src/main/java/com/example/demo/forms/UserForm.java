package com.example.demo.forms;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserForm {
    private static final String USER_FIRST_NAME_PATTERN = "^[a-zA-Z0-9]*$";
    private static final String USER_LAST_NAME_PATTERN = "^[a-zA-Z0-9]*$";
    private static final String MAIL_PATTERN = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{1,63}$";
    private static final String PASSWORD_PATTERN = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";
    private static final int PASSWORD_MINSIZE = 8;



    @Pattern(regexp = USER_FIRST_NAME_PATTERN, message = "userFirstName.empty")
    private String userFirstName;

    @Pattern(regexp = USER_LAST_NAME_PATTERN, message = "userLastName.empty")
    private String userLastName;

    @Pattern(regexp = MAIL_PATTERN, message = "Invalid Mail")
    private String email;

    private  String phoneNumber;

    private String companyName;

    @Pattern(regexp = PASSWORD_PATTERN, message = "Invalid Password")
    @Size(min = PASSWORD_MINSIZE, message = "Invalid Password Size")
    private String password;

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserForm(@Pattern(regexp = USER_FIRST_NAME_PATTERN, message = "userFirstName.empty") String userFirstName, @Pattern(regexp = USER_LAST_NAME_PATTERN, message = "userLastName.empty") String userLastName, @Pattern(regexp = MAIL_PATTERN, message = "Invalid Mail") String email, String phoneNumber, String companyName, @Pattern(regexp = PASSWORD_PATTERN, message = "Invalid Password") @Size(min = PASSWORD_MINSIZE, message = "Invalid Password Size") String password) {
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.companyName = companyName;
        this.password = password;
    }
}
