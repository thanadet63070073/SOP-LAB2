package com.example.lab2;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Customer {
    private String ID;
    private String name;
    private boolean sex;
    private int age;

    public Customer(){
        this("", null, "female", 0);
    }

    public Customer(String ID, String n, String s, int a){
        this.ID = ID;
        name = n;
        this.setSex(s);
        age = a;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if(sex.toLowerCase().equals("female")){
            this.sex = false;
        } else if (sex.toLowerCase().equals("male")) {
            this.sex = true;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0){
            age = 0;
        }
        this.age = age;
    }
}
