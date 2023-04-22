package com.myspring.dynamicbind.mock.controller;

import com.myspring.dynamicbind.mock.proxy.CalculatorProxy;
import com.myspring.dynamicbind.mock.service.Animal;
import com.myspring.dynamicbind.mock.service.Calculator;
import com.myspring.dynamicbind.mock.service.Doggy;
import com.myspring.dynamicbind.mock.service.MyCalculator;
import org.junit.jupiter.api.Test;

/**
 * @ClassName MyController
 * @Description 动态代理模拟：控制层，并没有严格按controller使用，只是用来测试代码
 * @Author Cheng Liu
 * @Date 21/04/2023 3:09 PM
 */
public class MyController {
    public static void main(String[] args) throws NoSuchMethodException {
        /*Calculator calculator = CalculatorProxy.getCalculator(new MyCalculator());
        calculator.add(1, 1);*/
    }

    @Test
    public void myTest() throws Exception {
        MyCalculator myCalculator = new MyCalculator();
        myCalculator.add(2, 1);
        myCalculator.sub(1, 2);

    }

    @Test
    public void proxyTest() throws Exception {
        //获取到的代理对象为：class com.sun.proxy.$Proxy,而不是Calculator、或是Calculator的实现类
        Calculator calculator = (Calculator) CalculatorProxy.getProxy(new MyCalculator());
        calculator.add(1, 1);
        calculator.sub(2, 1);

        System.out.println("获取到的代理对象为：" + calculator.getClass());

        Animal proxy = (Animal)CalculatorProxy.getProxy(new Doggy());
        proxy.eat("鸡jio");

    }
}