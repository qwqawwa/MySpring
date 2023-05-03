package com.myspring.xmlconfig.bean;

import org.springframework.stereotype.Component;

/**
 * @ClassName Teacher
 * @Description TODO
 * @Author Cheng Liu
 * @Date 03/11/2022 8:59 PM
 */
@Component
public class Teacher {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}