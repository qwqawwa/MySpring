package com.myspring.aop.service;

import org.springframework.stereotype.Service;

/**
 * @ClassName MyCalculator
 * @Description AOP使用:MyCalculator实现类
 * @Author Cheng Liu
 * @Date 22/04/2023 5:04 PM
 */
@Service
public class MyCalculator implements ICalculator {
    @Override
    public int add(int i, int j) throws NoSuchMethodException {
        int result = i + j;
        return result;
    }

    @Override
    public int sub(int i, int j) throws NoSuchMethodException {
        int result = i - j;
        return result;
    }
}