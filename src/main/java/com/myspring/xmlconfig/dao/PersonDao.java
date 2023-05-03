package com.myspring.xmlconfig.dao;

import org.springframework.stereotype.Repository;

/**
 * @ClassName PersonDao
 * @Description dao层
 * @Author Cheng Liu
 * @Date 23/10/2022 2:26 PM
 */
@Repository
public class PersonDao {

    public void save() {
        System.out.println("保存成功");
    }

    public void update() {
        System.out.println("更新成功");
    }
}