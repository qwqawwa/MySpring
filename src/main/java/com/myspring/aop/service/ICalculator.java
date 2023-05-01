package com.myspring.aop.service;

/**
 * AOP使用：calculator接口
 */
public interface ICalculator {
    public int add(int i, int j) throws NoSuchMethodException;

    public int sub(int i, int j) throws NoSuchMethodException;

    public int mul(int i, int j) throws NoSuchMethodException;

    public int div(int i, int j) throws NoSuchMethodException;
}
