package com.myspring.annotation.service;

import com.myspring.annotation.bean.Student;
import org.springframework.stereotype.Service;

/**
 * @ClassName StudentService
 * @Description 泛型依赖注入demo:StudentService
 * @Author Cheng Liu
 * @Date 16/04/2023 10:43 AM
 */
@Service
public class StudentService extends BaseService<Student> { //这里必须继承抽象类，并且指定泛型实现的数据类型
    //本身继承的抽象类里有一些默认的实现
}