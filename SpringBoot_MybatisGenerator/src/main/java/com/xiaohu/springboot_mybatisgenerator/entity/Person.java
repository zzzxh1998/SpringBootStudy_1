package com.xiaohu.springboot_mybatisgenerator.entity;

import java.util.Date;

public class Person {
    private Long id;

    private String password;

    private Date regdate;

    private String username;

    public Person(Long id, String password, Date regdate, String username) {
        this.id = id;
        this.password = password;
        this.regdate = regdate;
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public Date getRegdate() {
        return regdate;
    }

    public String getUsername() {
        return username;
    }
}