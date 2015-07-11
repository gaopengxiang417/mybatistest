package com.mybatis3.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * User: wangchen
 * Date: 15/7/11
 * Time: 15:18
 */
public class Student implements Serializable{

    private static final long serialVersionUID = -4683683353162223579L;

    private Integer id;

    private String name;

    private String email;

    private Date dob;

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
