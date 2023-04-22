package com.myspring.aop.mock.proxy;

import com.myspring.aop.mock.service.Calculator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @ClassName CalculatorProxy
 * @Description 动态代理模拟：计算器代理类，目的是做一个MyCalculator的代理，真正使用的时候，通过代理进行调用MyCalculator的方法
 * 这样的话，就方便在代理类里切成两部分：逻辑处理的部分，代理类里再单独写日志方面的逻辑
 * @Author Cheng Liu
 * @Date 21/04/2023 3:26 PM
 */
public class CalculatorProxy {
    //被代理对象
    private Object proxyTarget;

    public CalculatorProxy(Object proxyTarget) {
        this.proxyTarget = proxyTarget;
    }

    public static Object getProxy(Object proxyTarget) { //这里写接口，真正使用时实参传实现类，动态绑定

        //通过反射拿到calculator的类加载器
        ClassLoader classLoader = proxyTarget.getClass().getClassLoader();
        //通过反射拿到calculator的所有接实现口
        Class<?>[] interfaces = proxyTarget.getClass().getInterfaces();

        //InvocationHandler本身只提供了一个接口，可以使用内部类进行声明
        //InvocationHandler==》 handle invoke 用的，就是处理反射调用方法invoke
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                //记录日志
                System.out.println(method.getName() + "方法执行，参数为：" + Arrays.asList(args));

                //业务逻辑，相当于通过代理和反射，都用invoke来执行了；此时就可以在代理类里写其他的日志类型的处理
                //代理的目的是需要 通过代理调用被代理对象里的方法，所以用反射的invoke来写
                Object result = method.invoke(proxyTarget, args);//!!!!!!!注意，此处的实参，是calculator，没有用proxy参数

                //记录日志
                System.out.println(method.getName() + "方法执行结果：" + result);

                return result;
            }
        };
        //代理核心类Proxy类，通过Proxy.newProxyInstance获得代理实例
        //(ClassLoader loader 被代理对象的类加载器,  Class<?>[] interfaces 被代理对象的所有实现接口 ,  InvocationHandler h  )
        //返回值就是代理对象，//代理对象为：class com.sun.proxy.$Proxy,而不是Calculator、或是Calculator的实现类
        Object proxyObj =  Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
        return proxyObj;
    }
}