package com.myspring.aop.util;

/**
 * @ClassName LogUtil
 * @Description AOP使用：日志管理
 * @Author Cheng Liu
 * @Date 22/04/2023 5:18 PM
 */
@A
public class LogUtil {
    public void start() {
        System.out.println("方法执行");
    }

    public void stop() {
        System.out.println("方法执行结束....................");
    }

    public void exceptionThrow() {
        System.out.println("方法捕获异常");
    }

    public void resultReturn() {
        System.out.println("方法结果返回");
    }
}