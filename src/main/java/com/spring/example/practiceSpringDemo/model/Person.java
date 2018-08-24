package com.spring.example.practiceSpringDemo.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Date;

/**
 * Created by ganesan76 on 7/8/18.
 */
public class Person {

    private int id;
    private int age;
    private String name;

//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy")
//    private Date DOB;
    private String location;

    public Person() {

    }

    public Person(int id, int age, String name,String location) {
        this.id = id;
        this.age = age;
        this.name = name;
       // this.DOB = DOB;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setId(int id) {
        this.id = id;
    }
}
