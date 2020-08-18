package com.bessaleks.chatapp.models;

import org.apache.commons.codec.digest.DigestUtils;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userName, userLogin, userPassword;
    private Date userDateOfRegistration;
    private int userSessionCount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Date getUserDateOfRegistration() {
        return userDateOfRegistration;
    }

    public void setUserDateOfRegistration(Date userDateOfRegistration) {
        this.userDateOfRegistration = userDateOfRegistration;
    }

    public int getUserSessionCount() {
        return userSessionCount;
    }

    public void setUserSessionCount(int userSessionCount) {
        this.userSessionCount = userSessionCount;
    }

    public User(String userName, String userLogin, String userPassword) {
        this.userName = userName;
        this.userLogin = userLogin;
        this.userPassword = md5Apache(userPassword);
        this.userDateOfRegistration = new Date();
        this.userSessionCount = 1;
    }

    public User() {
    }

    public static String md5Apache(String st) {
        String md5Hex = DigestUtils.md5Hex(st);
        return md5Hex;
    }
}
