package com.myspring.service;

import com.myspring.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName BaseService
 * @Description TODO
 * @Author Cheng Liu
 * @Date 03/11/2022 9:01 PM
 */
public class BaseService<T> {

    @Autowired
    BaseDao<T> baseDao;

    public void save(){
        System.out.println("自动注入的对象： "+baseDao);
        baseDao.save();
    }

}