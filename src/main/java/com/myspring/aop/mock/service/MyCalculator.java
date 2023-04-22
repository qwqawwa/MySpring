package com.myspring.aop.mock.service;

import java.lang.reflect.Method;

/**
 * @ClassName MyCalculator
 * @Description 动态代理模拟：计算器接口实现类
 * 模拟传统和动态代理模拟的方式记录日志，体现动态代理模拟的好处以及使用方式，而AOP的底层其实依赖的就是动态代理
 * @Author Cheng Liu
 * @Date 21/04/2023 3:04 PM
 */
public class MyCalculator implements Calculator {

    @Override
    public int add(int i, int j) throws NoSuchMethodException {
        //不用AOP，传统写法，缺点很明显：冗长、繁琐、修改困难、不易于模块化
//        String method = this.getClass().getMethod("add", int.class, int.class).getName();
//        System.out.println(method + "方法执行,参数为：" + i + "-" + j);
        int result = i + j;
//        System.out.println("方法执行结果为：" + result);
        return result;
    }

    @Override
    public int sub(int i, int j) throws NoSuchMethodException {
        //不用AOP，传统写法
//        String method = this.getClass().getMethod("sub", int.class, int.class).getName();
//        System.out.println(method + "方法执行,参数为：" + i + "-" + j);
        int result = i - j;
//        System.out.println("方法执行结果为：" + result);
        return result;
    }

    public int mul(int i, int j) {
        int result = i * j;
        return result;
    }
}