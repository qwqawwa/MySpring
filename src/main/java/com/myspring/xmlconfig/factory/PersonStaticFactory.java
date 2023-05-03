package com.myspring.xmlconfig.factory;

import com.myspring.xmlconfig.bean.Person;

/**
 * @ClassName PersonStaticFactory
 * @Description 静态工厂类
 * @Author Cheng Liu
 * @Date 17/10/2022 9:21 PM
 */
public class PersonStaticFactory {

    public static Person getInstance(String name) {
        Person person = new Person();
        person.setId(1);
        person.setName(name);
        person.setAge(11);
        return person;
    }
}