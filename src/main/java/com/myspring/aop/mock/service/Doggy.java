package com.myspring.aop.mock.service;

/**
 * @ClassName Doggy
 * @Description 动态代理模拟，Animal的实现类
 * @Author Cheng Liu
 * @Date 21/04/2023 6:03 PM
 */
public class Doggy implements Animal{
    @Override
    public void eat(String food) {
        System.out.println("doggy 喜欢吃"+food);
    }
}