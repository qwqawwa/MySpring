package com.myspring.aop.mock.service;

/**
 * 动态代理模拟：计算器接口
 */
public interface Calculator {

    public int add(int i ,int j) throws NoSuchMethodException;
    public int sub(int i ,int j) throws NoSuchMethodException;
}
