package com.myspring.aop.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @ClassName LogUtil
 * @Description AOP使用：日志管理
 * @Author Cheng Liu
 * @Date 22/04/2023 5:18 PM
 */
@Aspect
@Component
public class LogUtil {

    @Before(value = "execution( public int com.myspring.aop.service.MyCalculator.add(int , int ))")
    public void start(JoinPoint joinPoint) {//通过JoinPoint对象可以拿到方法相关信息
        //通过JoinPoint获取方法名称
        String methodName = joinPoint.getSignature().getName();
        //童工JoinPoint获取方法参数
        Object[] methodArgs = joinPoint.getArgs();
        System.out.println(methodName + "方法执行,参数为：" + Arrays.asList(methodArgs));
    }

    @After(value = "execution( public int com.myspring.aop.service.MyCalculator.add(int ,int ))")
    public void stop() {
        System.out.println("方法执行结束....................");
    }

    @AfterThrowing(value = "execution( public int com.myspring.aop.service.MyCalculator.add(int ,int ))")
    public void exceptionThrow() {
        System.out.println("方法捕获异常");
    }

    @AfterReturning(value = "execution( public int com.myspring.aop.service.MyCalculator.add(int ,int ))")
    public void resultReturn() {
        System.out.println("方法结果返回");
    }
}