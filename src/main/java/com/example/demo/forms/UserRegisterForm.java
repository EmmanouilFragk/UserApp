package com.example.demo.forms;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserRegisterForm {
    private static final String USER_FIRST_NAME_PATTERN = "^[a-zA-Z0-9]*$";
    private static final String USER_LAST_NAME_PATTERN = "^[a-zA-Z0-9]*$";
    private static final String MAIL_PATTERN = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{1,63}$";
    private static final String PASSWORD_PATTERN = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";
    private static final int PASSWORD_MINSIZE = 8;


    @NotEmpty
    @Pattern(regexp = USER_FIRST_NAME_PATTERN, message = "Please insert a First Name.")
    private String userFirstName;

    @NotEmpty
    @Pattern(regexp = USER_LAST_NAME_PATTERN, message = "Please insert a Last Name.")
    private String userLastName;

    @NotEmpty
    @Pattern(regexp = MAIL_PATTERN, message = "Invalid Mail. Please insert a valid mail.")
    private String email;

    private  String phoneNumber;

    private String companyName;

    @NotEmpty
    @Pattern(regexp = PASSWORD_PATTERN, message = "Invalid Password. Please insert at least 8 characters, including 1 uppercase," +
            "1 lowercase, digits and 1 special character (@,# etc)!")
    @Size(min = PASSWORD_MINSIZE, message = "Invalid Password Size")
    private String password;

   /* @NotEmpty
    @Pattern(regexp = PASSWORD_PATTERN, message = "Invalid Password")
    @Size(min = PASSWORD_MINSIZE, message = "Invalid Password Size")
    private String confirmPassword;*/

    private String userType = "User";

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

    /*public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }*/

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
