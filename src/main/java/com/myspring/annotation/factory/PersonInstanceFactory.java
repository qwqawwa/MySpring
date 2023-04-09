package com.myspring.annotation.factory;

import com.myspring.annotation.bean.Person;

/**
 * @ClassName PersonInstanceFactory
 * @Description 实例工厂类
 * @Author Cheng Liu
 * @Date 17/10/2022 9:29 PM
 */
public class PersonInstanceFactory {

    public Person getInstance(String name){
        Person person = new Person();
        person.setId(2);
        person.setName(name);
        person.setAge(22);
        return person;
    }
}