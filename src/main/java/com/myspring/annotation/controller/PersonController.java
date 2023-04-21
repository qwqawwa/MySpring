package com.myspring.annotation.controller;

import com.myspring.annotation.service.AnimalService;
import com.myspring.annotation.service.PersonService;
import com.myspring.annotation.service.PersonService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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


   /*还可以使用@Qualifier注解来指定id的名称，让spring不要使用变量名,当使用@Qualifier注解的时候也会有两种情况：
    1、找到，则直接装配
    2、找不到，就会报错*/
  // @Qualifier("personService2"

    @Resource
    //private PersonService2 personServiceResource;
    private PersonService2 personService222;

    /**
     * 已知：Spring容器里的bean id，不专门定义的话，默认是类名首字母小写
     * 变量名personService123，其实目前没有一个bean id叫personService123的
     * 但是此时仍然可以自动装配到，即可证明：
     * 自动装配的规则，1.根据ByType来获取，此时如果只有一个就赋值
     * */
    @Autowired
    private PersonService personService123;//根据自动装配的规则，1.根据ByType来获取，此时如果只有一个就赋值；2.如果找到多个，在通过变量名去ById查找

    /**
     * 已知：目前有两个bean对象，AnimalService和DogService,继承关系
     * 此时按照ByType的方式查找，会找到2个；且变量名“animalService”也是存在的bean id
     * 但是此时仍然可以自动装配，即可证明：
     * 自动装配的规则，2.如果找到多个，在通过变量名去ById查找
     * */
    @Autowired
    private AnimalService animalService;

    /**
     * 已知：AnimalService 使用byType方式，会找到两个bean对象（DogService继承了AnimalService）
     * 所以Spring容器会拿到变量名按照ById接着去查找，此时并没有AnimalServiceQualifierTest 这个id的bean
     * 所以会报错
     * 但是如果加上@Qualifier("animalService")
     * Spring容器会拿到@Qualifier("animalService")参数名按照ById接着去查找
     * 而且经测试的结果来看，仍然是两步，
     * 1.AnimalService 使用byType方式加id的方式查找
     *      * Spring容器会拿到@Qualifier("animalService")参数名作为Id
     * */
    @Autowired
    @Qualifier("animalService")
    private AnimalService AnimalServiceQualifierTest;

    public void eat(){
        animalService.eat();
    }
    public void save(){
        //personService.save();
    }

    public void saveResource(){
        //personServiceResource.save();
        personService222.save();
    }

    @Override
    public String toString() {
        return "PersonController{" +
                "personService222=" + personService222 +
                ", personService123=" + personService123 +
                ", animalService=" + animalService +
                ", AnimalServiceQualifierTest=" + AnimalServiceQualifierTest +
                '}';
    }

    @Autowired
    public void test(){
        System.out.println("测试@AutoWired配置在方法上，在创建对象时就会执行本方法");
        personService222.save();
    }

/* public void update(){
        personService.update();
    }*/
}