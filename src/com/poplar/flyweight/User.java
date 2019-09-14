package com.poplar.flyweight;

/**
 * Created By poplar on 2019/9/14
 * 用户类
 */
public class User {

    private String name;

    public String getName() {
        return name;
    }

    public User(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
