package com.myspring.annotation.service;

import com.myspring.annotation.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName PersonService
 * @Description service层
 * @Author Cheng Liu
 * @Date 23/10/2022 2:27 PM
 */
@Service
public class PersonService {

    @Autowired
    private PersonDao personDao;

/*    @Autowired
    private PersonDao personDao2;*/

    public void save(){
        personDao.save();
    }

    //@Autowired可以写在方法上
    /* * 当方法上有@AutoWired注解时：
     *  1、此方法在bean创建的时候会自动调用
     *  2、这个方法的每一个参数都会自动注入值*/
    @Autowired
    public void update(PersonDao personDao2){
        boolean b = personDao2 == personDao;
        System.out.println("对比："+b);
        personDao2.update();
        //System.out.println("更新成功");
    }


    @Override
    public String toString() {
        return "PersonService{" +
                "personDao=" + personDao +
                '}';
    }
}