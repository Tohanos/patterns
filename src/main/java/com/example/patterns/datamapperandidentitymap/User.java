package com.example.patterns.datamapperandidentitymap;

import java.sql.Date;

public class User {
    private int id;
    private String userName;
    private String userPassword;
    private Date dateAdd;

    public User(int id, String userName, String userPassword, Date dateAdd) {
        this.id = id;
        this.userName = userName;
        this.userPassword = userPassword;
        this.dateAdd = dateAdd;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public Date getDateAdd() {
        return dateAdd;
    }
}
