package com.myspring.xmlconfig.service;

import com.myspring.xmlconfig.bean.Teacher;
import org.springframework.stereotype.Service;

/**
 * @ClassName TeacherService
 * @Description 泛型依赖注入demo:StudentService
 * @Author Cheng Liu
 * @Date 16/04/2023 11:09 AM
 */
@Service
public class TeacherService extends BaseService<Teacher> {//这里必须继承抽象类，并且指定泛型实现的数据类型
    //本身继承的抽象类里有一些默认的实现
}