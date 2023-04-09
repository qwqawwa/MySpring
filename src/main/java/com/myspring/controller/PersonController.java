package com.myspring.controller;

import com.myspring.service.PersonService;
import com.myspring.service.PersonService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @ClassName PersonController
 * @Description 控制层
 * @Author Cheng Liu
 * @Date 23/10/2022 2:27 PM
 */
@Controller(value = "personController")//可以使用value参数来修改bean的名称，但是一般不会改
//@Scope(value = "prototype")//@Scope注解声明当前类的bean是单例还是多例,默认单例
public class PersonController {

   @Autowired
   /*还可以使用@Qualifier注解来指定id的名称，让spring不要使用变量名,当使用@Qualifier注解的时候也会有两种情况：
    1、找到，则直接装配
    2、找不到，就会报错*/
  // @Qualifier("personService2")
    private PersonService personService1;

    @Resource
    //private PersonService2 personServiceResource;
    private PersonService2 personService22;

    public void save(){
        //personService.save();
    }

    public void saveResource(){
        //personServiceResource.save();
        personService22.save();
    }

   /* public void update(){
        personService.update();
    }*/
}