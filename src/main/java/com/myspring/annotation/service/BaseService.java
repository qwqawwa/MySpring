package com.myspring.annotation.service;

import com.myspring.annotation.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName BaseService
 * @Description 泛型依赖注入demo:基层的Service
 * @Author Cheng Liu
 * @Date 16/04/2023 10:41 AM
 */
//@Service  //注意，此时不应该把BaseService作为Spring Bean对象，因为本身有父子依赖关系，会导致查找到多个bean;
// 而且本身已经有子类实现放到Spring容器中了，没有意义再把父类也放进来
public abstract class BaseService<T> { //1.在抽象类上使用泛型，作用就是在实现类中指定泛型的数据类型
    @Autowired
    BaseDao<T> baseDao; //2.类定义的泛型，也会用在此处，决定BaseDao的类型
    //T t;

    public void saveService(){
        baseDao.save();
    }
}