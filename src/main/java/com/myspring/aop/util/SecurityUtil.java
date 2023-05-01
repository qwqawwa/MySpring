package com.myspring.aop.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @projectName: MySpring
 * @package: com.myspring.aop.util
 * @className: SecurityUtil
 * @author: ChengLiu
 * @description: 安全相关工具类
 * @date: 30/04/2023 11:09 pm
 */
@Aspect
@Component
@Order(100)
public class SecurityUtil {
    //此处通过@Pointcut注解定义表达式的抽象，相当于一个变量，大家应用这个变量就能拿到定义的表达式。
    // 而方法名就是这个变量
    @Pointcut(value = "execution( int com..MyCalculator.add(.. )) || execution(int com..MyCalculator.sub(.. ))")
    public void pointExpression() {
    }

    @Before(value = "pointExpression()") //使用引用定义的表达式的抽象，来获取表达式
    private void start(JoinPoint joinPoint) {//修改访问修饰符和返回值的目的，是测试通知方法定义时对这些是否有要求
        //通过JoinPoint获取方法名称
        String methodName = joinPoint.getSignature().getName();
        //通过JoinPoint获取方法参数
        Object[] methodArgs = joinPoint.getArgs();
        System.out.println("Security:" + methodName + "方法执行,参数为：" + Arrays.asList(methodArgs));
    }

    @After(value = "pointExpression()") //使用引用定义的表达式的抽象，来获取表达式
    private void stop(JoinPoint joinPoint) {//修改访问修饰符和返回值的目的，是测试通知方法定义时对这些是否有要求
        //通过JoinPoint获取方法名称
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Security:" + methodName + "方法执行完成");
    }
}
