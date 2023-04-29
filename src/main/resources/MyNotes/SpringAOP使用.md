<!-- TOC -->

- [1. Spring AOP的使用](#1-spring-aop的使用)
    - [1.1. 为什么需要AOP?](#11-为什么需要aop)
    - [1.2. 动态代理](#12-动态代理)
        - [1.2.1. 动态代理的两种方式](#121-动态代理的两种方式)
    - [1.3. AOP的相关概念](#13-aop的相关概念)
    - [1.4. AOP的通知类型](#14-aop的通知类型)
    - [1.5. AOP的应用场景](#15-aop的应用场景)
    - [1.6. 使用Spring AOP实际操作](#16-使用spring-aop实际操作)
    - [1.7. Spring AOP 对比 自己写的动态代理](#17-spring-aop-对比-自己写的动态代理)
- [2. 深入SpringAOP](#2-深入springaop)
    - [切入点表达式](#切入点表达式)
        - [表达式通配符](#表达式通配符)

<!-- /TOC -->

# 1. Spring AOP的使用

## 1.1. 为什么需要AOP?

从一个场景出发：如果说一个完整项目前期并没有做日志的记录，后期需要添加日志记录时，如果一个一个方法来加日志记录的代码，这明显是一个很大的问题。<br>
此时，如果能有办法把日志记录作为一个模块来抽象出来，并且指定在某些方法执行时则进行日志记录

## 1.2. 动态代理

### 1.2.1. 动态代理的两种方式

* JDK提供的通过接口
* cglib

## 1.3. AOP的相关概念

## 1.4. AOP的通知类型

after和afterReturning的区别：
after是目标方法执行完自后；afterReturning是目标方法返回值之后。
afterReturning比after执行更晚

## 1.5. AOP的应用场景

* 日志管理
* 权限认证
* 安全检查
* 事务管理（事务控制/事务记录）

## 1.6. 使用Spring AOP实际操作

1. 依赖pom.xml导入
2. properties配置文件打开<aop:aspectj-autoproxy>配置
    ```xml
     <!--重要，重要，重要！！！开启aop的注解功能-->
    <aop:aspectj-autoproxy></aop:aspectj-autoproxy>
    ```
3. 将service、controller、repository等注解配置在所需的类中，将这些java bean添加至Spring容器
    ```java
    @Service
    public class MyCalculator implements ICalculator {
        //实现方法xxx
    }
    ```
4. 找到切面类，在切面类中加入@Aspect @Component标签，aspect标签代表切面类，
   component标签设置让本切面类也能让Spring扫描到
    ```java
    @Aspect
    @Component
    public class LogUtil {
        //切面类
    }
    ```
5. 在切面方法上设置通知类型
    * @Before
    * @After
    * @AfterReturning
    * @AfterThrowing
    * @Around

    ```java
    @Aspect
    @Component
    public class LogUtil {

        @Before(value = "execution( public int com.myspring.aop.service.MyCalculator.add(int , int ))")
        public void start() {
            System.out.println("方法执行");
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
    
    ```
6. 通知类型的执行顺序

* 不报错的情况下：
  @Before --> @After --> @AfterReturning <br>
* 报错的情况下：
  @Before --> @After --> @AfterThrowing

## 1.7. Spring AOP 对比 自己写的动态代理

使用Spring AOP 的话，代码量非常的少，因为本身复杂的动态代理逻辑都封装在框架内了，实际上客户端代码只是做了注解和配置

# 2. 深入SpringAOP

* 注意，Spring本身会判断：
    + 被代理类如果能找到实现的接口，是按照JDK提供的动态代理实现AOP；
    + 如果没有接口实现，用的是cglib实现AOP
* JDK提供的动态代理和cglib性能的区别，早起是cglib性能更好一些，后来JDK提供的动态代理经过比较多的更新，目前二者效率差不多

## 切入点表达式

### 表达式通配符
