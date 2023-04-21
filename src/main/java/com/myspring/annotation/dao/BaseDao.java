package com.myspring.annotation.dao;

/**
 * @ClassName BaseDao
 * @Description 泛型依赖注入demo:基层的Dao
 * @Author Cheng Liu
 * @Date 16/04/2023 10:22 AM
 */
public abstract class BaseDao<T> { //在抽象类上使用泛型，作用就是在实现类中指定泛型的数据类型
    public abstract void save();
}