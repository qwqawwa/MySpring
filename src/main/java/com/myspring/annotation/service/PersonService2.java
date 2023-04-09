package com.myspring.annotation.service;

import com.myspring.annotation.dao.PersonDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName PersonService2
 * @Description TODO
 * @Author Cheng Liu
 * @Date 24/10/2022 10:11 PM
 */
@Service
public class PersonService2 {

    @Resource
    private PersonDao personDao;

    public void save(){
        System.out.println("personService2");
        personDao.save();
    }
}