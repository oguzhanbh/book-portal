package com.obss.model;

public class Authors {

    private int authorID;
    private String name;
    private String surname;


    public int getAuthorID() {
        return authorID;
    }

    public String getAuthorName() {
        return name;
    }

    public String getAuthorSurname() {
        return surname;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public void setAuthorName(String name) {
        this.name = name;
    }

    public void setAuthorSurname(String surname) {
        this.surname = surname;
    }

}
