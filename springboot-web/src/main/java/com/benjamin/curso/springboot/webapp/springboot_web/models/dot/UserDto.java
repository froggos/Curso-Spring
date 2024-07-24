package com.benjamin.curso.springboot.webapp.springboot_web.models.dot;

public class UserDto {
    private String title;
    private String user;
    private String lastname;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public String getLastname() {
        return lastname;
    }

    public String getUser() {
        return user;
    }
}
