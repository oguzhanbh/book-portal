package com.obss.model;

public class Users {

    private int userID;
    private String username;
    private String password;
    private String email;
    private int roleID;

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMail(String email) {
        this.email = email;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getMail() {
        return email;
    }

    public int getRoleID() {
        return roleID;
    }
}
