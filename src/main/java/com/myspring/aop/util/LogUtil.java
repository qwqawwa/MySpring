package com.myspring.aop.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
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
@Order(200)
public class LogUtil {

    //此处通过@Pointcut注解定义表达式的抽象，相当于一个变量，大家应用这个变量就能拿到定义的表达式。
    // 而方法名就是这个变量
    @Pointcut(value = "execution( int com..MyCalculator.add(.. )) || execution(int com..MyCalculator.sub(.. ))")
    public void pointExpression() {
    }

    @Pointcut(value = "execution( int com..MyCalculator.add(.. )) || execution(int com..MyCalculator.*(.. ))")
    public void pointExpression2() {
    }

    //@Before(value = "execution( int com.myspring.aop.service.MyCalculator.add(* , int ))")
    //@Before(value = "execution( int com.myspring.aop.service.MyCalculator.add(.. ))")
    //@Before(value = "execution( int com..MyCalculator.add(.. ))")
    //使用通配符和逻辑运算符直接定义切入点表达式
    //@Before(value = "execution( int com..MyCalculator.add(.. )) || execution(int com..MyCalculator.sub(.. )) ")

    @Before(value = "pointExpression()") //使用引用定义的表达式的抽象，来获取表达式
    //public void start(JoinPoint joinPoint) {//重要，通过JoinPoint对象可以拿到方法相关信息
    private int start(JoinPoint joinPoint) {//修改访问修饰符和返回值的目的，是测试通知方法定义时对这些是否有要求
        //通过JoinPoint获取方法名称
        String methodName = joinPoint.getSignature().getName();
        //int modifiers = joinPoint.getSignature().getModifiers();
        //String declaringTypeName = joinPoint.getSignature().getDeclaringTypeName();
        //System.out.println(modifiers);
        //System.out.println(declaringTypeName);
        //童工JoinPoint获取方法参数
        Object[] methodArgs = joinPoint.getArgs();
        System.out.println("Log:" + methodName + "方法执行,参数为：" + Arrays.asList(methodArgs));
        return 100;//修改访问修饰符和返回值的目的，是测试通知方法定义时对这些是否有要求
    }

    @After(value = "pointExpression()")
    public void stop(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println("Log:" + name + "方法执行结束....................");
    }

    @AfterThrowing(value = "execution( public int com.myspring.aop.service.MyCalculator.*(..))", throwing = "exception")
    public void exceptionThrow(Exception exception) {
        System.out.println("Log:" + "方法捕获异常" + exception);
    }

    @AfterReturning(value = "execution( public int com.myspring.aop.service.MyCalculator.*(int ,int ))", returning = "result")
    public void resultReturn(JoinPoint joinPoint, Object result) {
        String name = joinPoint.getSignature().getName();
        System.out.println("Log:" + name + "方法结果返回" + result);
    }

    @Around(value = "pointExpression()")
    public Object recordLog(ProceedingJoinPoint proceedingJoinPoint) { //使用的是ProceedingJoinPoint很关键，不同于之前的Joinpoint
        String name = proceedingJoinPoint.getSignature().getName();//ProceedingJoinPoint也可以像Joinpoint一样获取方法的详细信息
        Object[] args = proceedingJoinPoint.getArgs();
        Object proceed = null;
        try {
            System.out.println(name + "方法执行前，Around通知");//相当于我们像自己写的动态代理类一样，很灵活的在方法中定义“在哪增强”“写什么增强逻辑”
            //这里的proceed方法等同于 反射的invoke方法，都是通过反射调用实际的业务逻辑方法
            proceed = proceedingJoinPoint.proceed(args);
            System.out.println(name + "方法已执行完成，Around通知");
        } catch (Throwable e) {
            System.out.println(name + "方法异常，Around通知异常信息：" + e.getLocalizedMessage());
            throw new RuntimeException(e);
        } finally {
            System.out.println(name + "方法执行完成，，Around通知,返回结果：" + proceed);
            return proceed;
        }

    }
}