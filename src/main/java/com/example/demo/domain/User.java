package com.example.demo.domain;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class User {

    private static final int MAX_NAME_LENGTH  = 50;

    @Id
    @Column(name = "UserId", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstName", nullable = false, length = MAX_NAME_LENGTH)
    private String firstName;

    @Column(name = "lastName", nullable = false, length = MAX_NAME_LENGTH)
    private String lastName;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @Column(name = "companyName")
    private String companyName;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "userType", nullable = false)
    private String userType;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getUserType() { return userType; }

    public void setUserType(String userType) { this.userType = userType; }
}
