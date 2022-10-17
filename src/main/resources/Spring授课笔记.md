





# 一.介绍Spring框架

## 		1.1学习Spring框架的原因

​		企业级应用是指那些为商业组织，大型企业而创建并部署的解决方案。这些大型企业级应用的结构复杂，涉及的外部资源众多，事务密集，数据规模大，用户数量多，有较强的安全性考虑和较高的性能要求。

​		而且企业级应用不但要有强大的功能，还要能够满足未来业务需求的变化，易于扩展和维护。

​		传统JavaEE解决企业级应用问题时的开发效率，开发难度和实际的性能都令人失望。正在人们苦苦寻找解决办法的时候，Spring以一个"救世主"的形象出现在广大java程序员面前。

​		说到Spring就得提到它的作者Rod Johnson ，2002年他在编写的书中对 传统的JavaEE技术日益臃肿和低效提出了质疑，他觉得应该有更便捷的做法。2003年2月Spring框架正式成为一个开源项目。

​		Spring致力于Java EE应用的各种解决方案，而不是仅仅专注于某一层的方案。可以说，Spring是企业应用开发的“一站式”选择，Spring贯穿表现层，业务层，持久层。然而，Spring并不想取代那些已有的框架，而是以高度的开放性与它们无缝整合。

总结：使用传统javaEE开发企业级引用存在   代码层和层之间的耦合性比较高；后期的扩展性比较低
     	 Spring 解决了业务层和其他各层之间的耦合 （高内聚、低耦合）



## 		1.2介绍Spring

​		Spring 的全称：  Spring Framework

​		Spring是一个优秀的开源的轻量级的企业应用开发框架，是为了解决企业应用程序开发复杂性而创建的。它大大简化了java企业级开发的复杂性，提供了强大，稳定的功能，能够创建出松耦合，易测试，易扩展，易维护的java应用系统，又没有带来额外的负担。它坚持一个原则：不重新发明轮子。已经有较好解决方案的领域，Spring绝不做重复性的实现。例如对象持久化和ORM，Spring只是对现有的JDBC，mybatis，等技术提供支持，使之更易用，而不是重新做一个实现。框架的主要优势之一就是其分层架构，分层架构允许您选择使用哪一个组件。

Spring 的核心代码均来自于真实的项目，Rod Johnson是这个产品的创造者，是从商业项目开发实践中逐步提炼出的一种架构基调。

从2003年正式启动，整个项目的开发始终贯彻着如下的核心架构理念：

​		A.降低开发成本，方便使用，促进良好的编程习惯

​		B.整合各类框架，遵守轮子理论（不重复的造轮子 ，使用现有的轮子）

​		C.易于选择，方便测试

​		D.统一配置，灵活可扩展

​		E.非侵入式

​		F.提供最好的IOC解决方案

​		G.提供最好的AOP解决方案



## 	1.3介绍Spring的架构图

 	   Spring框架由大约20个功能模块组成。组成Spring 框架的每个模块（或组件）都可以单独存在，或者与其他一个或多个模块联合实现。每个模块的功能如下：

![3](文档图片\3.png)

Spring Core：核心容器提供Spring 框架的基本功能，为Spring提供了基础服务支持，核心容器的主要组件是BeanFactory 。

​				通过BeanFactory，Spring使用工厂模式来实现控制反转（IOC ） ，将应用程序的配置和依赖关系与实际的应用程序代码分开。

​				Spring之所以称为容器，就是由于BeanFactory的自动装备和注入。



Spring Context：Spring 上下文是一个配置文件，向Spring 框架提供上下文信息。主要用于加载属性文件,扫描本地的包等

​							BeanFactory使Spring成为容器，上下文模块使Spring成为框架。

​							这个模块对BeanFactory进行了扩展，添加了对I18N，系统生命周期事件以及验证的支持。这个模块提供了许多企业级服务，例如：邮件服务、JNDI访问 、EJB集成、远程调用以及定时服务，并且支持与模板框架的集成。



Spring AOP ： 通过配置管理特性，Spring AOP 模块直接将面向切面编程功能集成到了Spring 框架中（AOP把一个业务流程分成几部分，例如权限检查、业务处理、日志记录， 每个部分单独处理，然后把它们组装成完整的业务流程。每个部分被称为切面）。所以，可以很容易地使Spring 框架管理的任何对象支持AOP 。Spring AOP 模块为基于Spring 的应用程序中的对象提供了事务管理服务。



Spring JDBC：这个模块封装了数据库连接的创建、语句对象生成、结果集处理、连接关闭等操作，而且重构了所有数据库系统的异常信息，用户不在需要处理数据库异常了。提供了JDBC的抽象层，简化了JDBC编码，同时使代码更健壮。 在这个模块中，利用了Spring的AOP模块完成了为系统中对象提供事务管理的服务。



Spring ORM ：Spring没有实现自己的ORM方案，而是为当前主流的ORM框架预留了整合接口，包括Mybatis,Hibernate等。所有这些都遵从Spring 的通用事务和DAO 异常层次结构。 Spring的事务管理支持所有这些ORM框架以及JDBC。



Spring web：集成各种优秀的web层框架的模块（Struts、Springmvc）



## 1.4Spring框架学习   

**1.4.1 Spring 学习的核心内容**
1)	 IOC：控制反转--帮助我们创建对象的
2)	 AOP：面向切面编程---提升代码的扩展性，有点像过滤器.针对方法.
3)	 TX：声明式事务管理---强大事务管理机制.事务过程不需要程序员编写,只需要声明出哪些方法需要进行事务管理.

**1.4.2Spring学习必备资料**

A)	jar 包
B)	API
C)	源码

⦁	官方jar下载地址
https://repo.spring.io/libs-release-local/org/springframework/spring/
⦁	源码下载地址
https://github.com/spring-projects/spring-framework/tags

从Spring3开始把jar拆分成了多个： Spring2及SPring2之前只有一个jar包



# 二.Spring IOC简介和环境搭建



​	**责任链**
  	  我们在使用MVC进行开发的时候数据在各层之间进行传递，数据传递的时候在业务上形成一个链条，这个链条称之为责任链
​	**基于责任链模式开发的缺点**
​    	层和层之间的相互调用造成了耦合性比较高
​	**解决的方案**
​		Spring  IOC  :控制反转
​		英文全称：Inversion of Control

​		控制:对类实例化的控制.指的是创建对象这个事情.

​		反转:以前由程序员实例化的过程,转交给Spring进行实例化.
​		通俗解释:由Spring帮助实化对象,释放程序员对对象的关注度,所有的关注度都放在业务上.同时还可以达到解耦的效果.

​	**项目应用场景**

​		1.帮助创建SqlSessionFactory
​		2.管理所有Mapper接口,管理所有ServiceImpl类.

​     **理解示意图**  

![12](文档图片\12.jpg)



Spring不依赖于容器的框架.没有tomcat也能运行.	
**环境搭建步骤:**

1)	pom.xml里添加依赖：

```
	<!--进行junit单元测试 -->
 	<dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.11</version>
      <scope>test</scope>
    </dependency>

	<!--依赖于commons-logging日志管理 -->
    <dependency>
      <groupId>commons-logging</groupId>
      <artifactId>commons-logging</artifactId>
      <version>1.2</version>
    </dependency>

	<!--提供了框架的基本组成部分,包括IOC 和 DI-->
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-core</artifactId>
      <version>4.1.6.RELEASE</version>
    </dependency>

	<!-- 提供了BeanFactory-->
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-beans</artifactId>
      <version>4.1.6.RELEASE</version>
    </dependency>

	<!--上下文配置对象，提供一个框架式的对象访问方式-->
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-context</artifactId>
      <version>4.1.6.RELEASE</version>
    </dependency>
    
	<!--提供了强大的表达式语言-->
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-expression</artifactId>
      <version>4.1.6.RELEASE</version>
    </dependency>
```

2)	resources下创建applicationContext.xml：

```
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans    http://www.springframework.org/schema/beans/spring-beans.xsd">
    <!--User  user =new User();
        id:通过这个属性获取类的对象
    	class:配置哪个类的对象
     -->
       <bean id="us" class="com.msb.pojo.User"></bean>
</beans>
```

【注解】Schema和DTD的区别和联系
1 联系:都是XML文件的验证器.
2 Schema是DTD的升级版.可扩展性更强.
	2.1 在一个xml中引入多个XSD文件.
	xmlns:自定义名称=”路径”

​	2.2在一个xml中只能引入1个DTD文件



3)	测试类代码：

```
//[1]解析applicationContext.xml

//Spring配置文件运行后产生ApplicationContext接口对象.
//Spring中所有内容都放入到ApplicationContext容器中.

 ApplicationContext  app =new ClassPathXmlApplicationContext("applicationContext.xml") ;

 //[2]获得user对象
 User us = (User) app.getBean("us");
 
 // getBean(“<bean>id属性值”,对象是什么类型);
 // 如果省略第二个参数,getBean()返回值为Object

 us.eat();
```

4） 总结：

​	**IOC实现的好处**
​		实现代码之间的解耦
​	**IOC ：控制反转**
  	 控制：创建对象的过程
 	  反转：创建对象的操作本身是程序员自己完成的，现在反交给Spring 进行创建。





# 三.Spring IOC创建对象方式

### 3.1	使用无参构造

```
public class User {
    private Integer uid;
    private String uname;
    private  Integer uage;
    private  String usex;
    ==省略get/set，toString方法
    public User(){}
 }
```



```
<!--[1]使用无参构造创建对象-->
<bean id="stu" class="com.msb.pojo.User"></bean>

```

### 3.2	使用有参构造

```
public class User {
    private Integer uid;
    private String uname;
    private  Integer uage;
    private  String usex;
    ==省略get/set，toString方法
    public User(int uid,String uname,int uage,String usex){
     	this.uid = uid;
        this.uname = uname;
        this.uage=uage;
        this.usex = usex;
    }
 }
```



```
<!--[2]使用有参构造
     A、name属性和对应类中的有参构造的形参名称一致
     B、书写constructor-arg 标签的顺序和有参构造的形参的顺序无关
     C、我们可以使用 name 、index  和 type   共同约束我们调用的方法
     D、可以去掉name index，只留value，但是必须在配置文件中属性的顺序，与有参构造形参的顺序一致
     E、当有多个相同参数的构造方法存在的时候，默认是覆盖的过程，代码中在后面的构造方法会覆盖前面的构造方法
-->
<bean id="stu2" class="com.msb.pojo.User">

    <!--<constructor-arg name="uid" value="111"></constructor-arg>
    	<constructor-arg name="usex" value="男"></constructor-arg>
    	<constructor-arg name="uname" value="zs"></constructor-arg>-->	

    <constructor-arg  index="0" type="int" value="112"></constructor-arg>
    <constructor-arg  index="1" type="java.lang.String" value="李四"></constructor-arg>
    <constructor-arg  index="1" type="java.lang.String" value="女"></constructor-arg>
</bean>
```

### 3.3	使用工厂模式

**设计模式：**解决某一类问题的产生
**工厂设计模式：**可以达到对象的统一管理，可以批量的产生某一类对象。

**实现步骤：**

【方案一：使用实例工厂类 + 无参】

1） 创建一个实例工厂类

```
public class UsersFactory {
    public  User getInstance(){
        return new User(123,"李思思","女");
    }  
}
```

2） 在applicationContext.xml 先实例工厂对象,创建对应Bean的对象

```
<!-- UsersFactory  factory=new  UsersFactory()-->
<bean id="factory" class="com.msb.util.UsersFactory"></bean>

<!-- User  user1= factory.getInstance()-->
<bean id="user1" factory-bean="factory" factory-method="getInstance" ></bean> 
```



【方案二：使用静态工厂类 + 无参】

1）创建一个静态工厂类
public class UsersFactory {
    public static  User getStaticInstance(){
        return new User(123,"李思思","女");
    }  
}
2） applicationContext.xml直接指定哪个工厂类的哪个方法生成对应Bean对象

```
<!-- User  user2= UsersFactory.getStaticInstance()-->
<bean id="user2" class="com.msb.util.UsersFactory" factory-method="getStaticInstance" ></bean>
```



【方案三：使用实例工厂类 + 有参】

1） 创建一个实例工厂类

```
public class UsersFactory {
    public  User getInstance1(User user){
        return user;
    }
}
```

2） 在applicationContext.xml 先实例工厂对象,创建对应Bean的对象，同时设置参数。

```
<!-- UsersFactory  factory=new  UsersFactory()-->
<bean id="factory" class="com.msb.util.UsersFactory"></bean>


<!-- User  user3= factory.getInstance1(us)-->
<bean id="user3" factory-bean="factory" factory-method="getInstance1" >
 	<constructor-arg name="user" ref="us"></constructor-arg>
</bean> 
```



【方案四：使用静态工厂类 + 有参】

1） 创建一个静态工厂类

```
public class UsersFactory {
    public static User getInstance2(User user){
        return user;
    }
}
```

2） applicationContext.xml直接指定哪个工厂类的哪个方法生成对应Bean对象，同时设置参数

```
 <!--User  user2= UsersFactory.getInstance2(us)--->
<bean id="user4" class="com.msb.util.UsersFactory" factory-method="getInstance2">
    <constructor-arg name="user" ref="us"></constructor-arg>
</bean>
```





#### 3.3.1 介绍工厂设计模式

1）设计模式:解决某种特定问题的代码编写方案.
2）工厂设计模式:某个特定类型(父类及子类)对象由工厂统一生产.以达到对象统一管理.

3）实例工厂
 	需要实例化工厂对象,根据工厂对象调用生成对象的方法.
4）实例实现步骤:

4.1）创建PeopleFactory
public class PeopleFactory {
	public People getInstance(String name) {
		switch (name) {
		case "teacher":
			return new Teacher();
		case "student":
			return new Student();
		case "programmer":
			return new Programmer();
		}
		return null;
	}
}
4.2） 编写测试代码
//实例工厂:先创建工厂对象,调用工厂中方法
PeopleFactory factory = new PeopleFactory();
People people = factory.getInstance("teacher");



5）静态工厂
5.1） 与实例方法的区别是,生产方法上添加static
public class PeopleFactory {
	public static People getInstance(String name) {
		switch (name) {
		case "teacher":
			return new Teacher();
		case "student":
			return new Student();
		case "programmer":
			return new Programmer();
		}
		return null;
	}
}
5.2） 测试代码,获取对象更加方便
People people = PeopleFactory.getInstance("student");





### 3.4介绍IOC容器

![7](文档图片\7.png)

加载多配置文件的时候：

方式一：ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext-*.xml");

方式二：ApplicationContext app=new ClassPathXmlApplicationContext(new String[]{"applicationContext-1.xml","applicationContext-2.xml"});





### 3.5 介绍Bean标签 

⦁	<bean>的一个属性,控制如何实例化对象
3.5.1 lazy-init 属性

​			true:懒加载

​			false:立即加载

​			<beans>里default-lazy-init:当前配置文件里的所有bean对象都设置为懒加载。

3.5.2 init-method 属性

​			用于设置对象 初始化阶段 调用的方法。

3.5.3 destory-method 属性

​			用于设置对象 销毁阶段 调用的方法

3.5.4 Scope属性可取值
			 singleton: 默认值,单例的.使用ApplicationContext启动时实例化对象
			 prototype:原型.每次调用时实例化.
			 request:每次请求时实例化对象.
			 session:每次产生session(HttpSession)时实例化
			 ~~application:产生application对象时实例化.一般都实例化一次.~~
			 golbal session: 全局Golbal Session,web应用中一个新的全局HttpSessin对象.在spring-webmvc-portlet提供



#### 3.5.1 单例设计模式

1）单例设计模式:让整个应用程序中只能产生某个类的一个对象.
2）好处:
	2.1 通过对象共享数据.(application)
	2.2 减少系统内存占用
3）分类:
	3.1 懒汉式
public class People {
	private static People people;
	private People(){}
	public static People getInstance(){
		if(people==null){
			synchronized (People.class) {
				if(people==null){
					people = new People();
				}
			}
		}
		return people;
	}
}

​	3.2 饿汉式
public class People2 {
​	private static People2 people=new People2();
​	private People2(){}
​	public static People2 getInstance(){
​		return people;
​	}
}  






# 四.Spring DI注入的三种方式

### 4.1 利用DI进行解决 

​	1.为什么使用DI（依赖注入）

​		作用：给对象中的全局属性进行赋值的操作

​	2.英文全称(Dependency Injection) 

​	3.中文名称:依赖注入 
 		3.1 依赖:一个类在另一个类中作为全局属性时 
​		 3.2 注入:通过Spring容器为自己的属性注入一个值 

​	4.DI的意义 

​		5.1 解除类与类之间高耦合性，给对象中全局对象赋值的操作 

​	5.为什么称DI和IoC是同一个事情. 
   	6.1 Spring帮助创建对象的过程叫做IoC,创建对象时给对象中全局对象赋值叫做DI,所以认为IoC和DI是同一个事情.





### 4.2 DI注入的三种方式 

**前期代码实现**
（1）创建实体类：
public class People {
	private int id;
	private String name;
	private String address;
	private Classroom classroom;

}

#### 1.构造注入

 <!--【A】使用有参构造进行值的注入-->
 <!--
     value  和 ref的使用场景
     如果给基本数据类型+String  注入值的时候使用 value
     如果给对象注入值的时候  使用 ref
 -->

.提供有参构造方法,通过<bean>的<constructor-arg>注入
<bean id="classroom" class="com.msb.pojo.Classroom">
</bean>
<bean id="peo" class="com.msb.pojo.People">
 	<constructor-arg index="0" value="1"></constructor-arg>
 	<constructor-arg index="1" value="张三"></constructor-arg>
	 <constructor-arg index="2" value="西三旗"></constructor-arg>
	<constructor-arg index="3" ref="classroom"></constructor-arg>
</bean>



#### 2.设值注入

:执行属性的set方法.
===结合<property>标签进行实现
<bean id="classroom" class="com.msb.pojo.Classroom">
 	<property name="id" value="1"></property>
 	<property name="name" value="C01"></property>
</bean>
<bean id="peo" class="com.msb.pojo.People">
 	<property name="id" value="123"></property>
 	<property name="name" value="张三"></property>
 	<property name="classroom" ref="classroom"></property>
</bean> 





##### 2.1.设置注入时不同数据类型的注入方式

1.	String或基本数据类型等
   <bean id="classroom" class="com.msb.pojo.Classroom">
   	<property name="id" value="1"></property>
   </bean>
1.	属性是对象类型
   <bean id="peo" class="com.msb.pojo.People">
   	<property name="classroom" ref="classroom"></property>
   </bean> 
1.	属性是数组时,和list可以相互替换
   <property name="strs">
   		<array>
   			<value>1</value>
   			<value>2</value>
   			<value>3</value>
   			<value>4</value>
   		</array>
   	</property>
1.	属性是List集合时,可以和array相互替换
   <property name="list">
   		<list>
   			<value>1</value>
   			<value>2</value>
   			<value>3</value>
   			<value>4</value>
   		</list>
   	</property>
1.	属性是Set集合时
      <property name="set">
      		<set>
      			<value>2222</value>
      			<value>3333</value>
      			<value>444</value>
      		</set>
      	</property>
1.	属性是Map集合时
   <property name="map">
   		<map>
   			<entry>
   				<key>
   					<value>a</value>
   				</key>
   				<value>a的内容</value>
   			</entry>
   			<entry>
   				<key>
   					<value>b</value>
   				</key>
   				<value>b的内容</value>
   			</entry>
   		</map>
   ​	</property>
1.	属性是Properties类型时,用spring配置文件配置出.properties文件的效果.
   <property name="pro">
   		<props>
   			<prop key="key">value</prop>
   		</props>
   	</property>





#### 3.自动注入（了解）

配置自动注入的方式有两种，一种是全局配置，另一种是局部单独配置。

　　全局配置：只配置一次，之后配置文件中的所有bean，都按照全局配置进行注入，全局配置是在<beans>标签中配置default-autowire="Xxx"；

　　局部单独配置：对于每一个bean，单独设置注入方式，单独配置是在单独的<bean>标签中配置autowire="xxx"。



全局配置 default-autowire 和 局部配置autowire区别：
	1 default-autowire配置<beans>当前xml文件所有<bean>都使用这种注入方式
	2 autowire:配置<bean>只针对这个<bean>生效
	3 如果配置了default-autowire和autowire时候,autowire生效.



通过<bean>的autowire属性控制类中属性自动注入方式，对于全局配置和局部单独配置，都有5个值可以选择：

　　1、no：当autowire设置为no的时候，Spring就不会进行自动注入，相当于不给引用属性赋值。

　　2、byName：在Spring容器中查找id与**引用类型的属性名相同**的bean，并进行注入。 *底层调用的是**属性的set方法**

　　		===无法注入String或基本数据类型或value赋值的属性，若没有对应的名称则返回null。

​		3、byType：在Spring容器中查找类型与**引用类型的数据类型相同**的bean，并进行注入。*底层调用的是**属性的set方法**

　　		===无法注入String或基本数据类型或value赋值的属性，若有多个同类型bean定义，则报异常。

​		4、constructor：先使用byName方式进行匹配，如果没有对应的值，再根据byType方式进行匹配。  *底层调用的是**构造器方法**

　　5、default：默认值.看全局<beans>的default-autowire属性的值

```
<bean id="user" class="com.msb.pojo.User">
    <constructor-arg name="uid" value="000"/>
    <constructor-arg name="name" value="用户名字"/>
    <constructor-arg name="uage" value="11"/>
    <constructor-arg name="usex" value="女"/>
</bean>

<bean id="stu" class="com.msb.pojo.Student" autowire="byName"></bean>
```







# 五.代理模式实现AOP

## 		5.1介绍代理模式

1.代理模式
     设计模式的一种，解决某一类问题的产生
     分为：静态代理

​				动态代理【JDK动态代理、CGLIB动态代理】

2.代理模式的角色
	1.抽象对象(抽象父类或接口):需要完成的功能
	2.被代理对象:隐藏起来的对象
	3.代理对象:暴露给其他人的对象,访问被代理对象通过代理对象进行访问

3.代理模式案例:我们找中介租房
	1.抽象对象: 租房
	2.被代理对象:房东
	3.代理对象:中介(做了额外事情,包房东保护起来)
	4.调用者:我们

4.代理模式的好处
	1.被代理对象可以专注完成自己的业务(房东安心的做自己的事情即可，不用管理其他的事情)
	2.保护了被代理对象(房东对象比较的安全)
	3.增强了代码的扩展性

5.实现静态代理的步骤

​	5.1 创建抽象对象: Zufang接口

	public interface Zufang {
		/*
	 	 * 需要完成的事情
		 */
		void zufang();
	}
​	5.2 创建被代理对象Fangdong

```
public class Fangdong implements Zufang {
	public void zufang() {
		System.out.println("出租五环科技园C座c01");
	}
}
```

​	5.3 创建代理对象Zhongjie

```
public class Zhongjie implements Zufang {
	//房东人:张三
	private Fangdong fangdong = new Fangdong();
	@Override
	public void zufang() {
		System.out.println("收房东的中介费");
		fangdong.zufang();
		System.out.println("收我们的中介费");
	}
}
```

​	5.4 创建调用者Women

```
public class Women {
	public static void main(String[] args) {
		//小王
		Zhongjie zhongjie = new Zhongjie();
		zhongjie.zufang();
	}
}
```

6.静态代理缺点:
        缺点：1.随着房东/被代理对像的增多，中介的压力就会越来越大，体现到代码上就是代码越来越臃肿





## 5.2介绍AOP

1.为什么使用AOP
       IOC ：控制反转--帮助我们创建对象--实现解耦
       AOP：面向切面编程--提升代码的扩展性

​		按照软件重构思想的理念，在OOP中通过抽象把相同的代码抽取到父类中（纵向抽取），但无法通过抽象父类的方式消除重复性的横切代码（如事务处理这种非业务性的重复代码），而AOP就是为了解决将分散在各个业务逻辑代码中的相同代码通过横向切割的方式抽取到一个独立的模块中。

![11](文档图片\11.png)

​		AOP面向切面编程，并不是要替代OOP，仅做为OOP的有益补充。 利用AOP可以对业务逻辑的各个部分进行隔离，从而使得业务逻辑各部分之间的耦合度降低，提高程序的可重用性，同时提高了开发的效率。



2.AOP的简介
  	AOP的概念：Aspect Oriented Programming
	  AOP的中文： 面向切面编程

​      AOP有特定的应用场合，它只适合具有横切逻辑的应用场合，如：性能检测，访问控制，事务控制，日志记录等。就像面向对象编程的关注点在于对象 即类；而面向切面编程的关注的在于切面；

​	   那么什么是切面？可以理解为程序执行时的某个节点，或者更具体一点，在某个方法执行之前，执行之后等节点。

​     使用AOP技术，可以将一些系统性相关的编程工作，独立提取出来，独立实现，然后通过切面切入进系统。从而避免了在业务逻辑的代码中混入很多的系统相关的逻辑——比如权限管理，事物管理，日志记录等等。这些系统性的编程工作都可以独立编码实现，然后通过AOP技术再切入进系统即可。从而达到了 将不同的关注点分离出来的效果。

​		举个例子：我现在要实现一个删除功能，在Servlet里 调用了 业务逻辑层里的删除方法。而在业务逻辑层Service实现类里，需要在删除方法前进行权限检查，在删除方法后进行日志记录。那我就将权限检查和日志记录两个方法提取出来，放到单独的一个类里去 ，而不是跟删除的业务代码杂糅在一块。最后在通过AOP技术动态织入到删除方法周围。在service实现类里的删除方法就是切点/连接点（连接点范围更大，管符合一定条件规则的连接点叫切点）；而权限检查和日志记录就是切面；切面的工作内容叫做通知 同时通知也规定了什么时候执行切面。



3.AOP中的几个要素

1） Aspect ：切面，切入系统的一个切面。比如事务管理是一个切面，权限管理也是一个切面；

2） Join point ：连接点，也就是可以进行横向切入的位置；

3） Advice ：通知，切面在某个连接点执行的操作(分为: Before advice , After returning advice , After throwing advice , After (finally) advice , Around advice )；

4） Pointcut ：切点，符合切点表达式的连接点，也就是真正被切入的地方；

**理解示意图：**

![6](文档图片\6.png)



4.AOP的分类：		

​		AOP分为静态AOP和动态AOP。静态AOP他是将切面代码直接编译到Java类文件中。动态AOP是指先将切面代码统一放到一个切面类里去，然后进行动态织入到指定的切点方法周围，从而实现AOP。Spring的AOP为动态AOP，实现的技术为： JDK提供的动态代理技术 和 CGLIB(动态字节码增强技术) 。尽管实现技术不一样，但 都是基于代理模式 ， 都是生成一个代理对象 。





## 5.3静态代理实现AOP

### 	5.3.1第一阶段的静态代理

实现步骤：

1.创建接口UserService

```
void add() throw Exception;
void delet() throw Exception;
```

2.创建接口实现类UserServiceImpl

```
public void add() throw Exception{
 	check();
	System.out.println("添加成功");
	log();
}
public  void  check(){
	System.out.println("权限检查");
}
public  void  log(){
	System.out.println("日志记录");
}
```

3.编写测试方法

```
 ApplicationContext app=new ClassPathXmlApplicationContext("applicationTest.xml");
 UserService UserService=(UserService)app.getBean("UserService");
 UserService.add();
```

4.存在问题：

第一阶段的静态代理，在UserServiceImpl实现类中业务代码严重的与横切性代码耦合在一起了。

解决办法：将横切性代码提取出来，与业务代码 分开存放。





### 	5.3.2第二阶段的静态代理

代码实现：

1.创建一个静态代理类：

com.msb.proxy 包下创建创建UserServiceProxy类 实现跟UserServiceImpl类一样的接口

```
public class UserServiceProxy implement UserService{
	private UserServiceImpl usi;//静态代理，指明代理的是谁。
	public UserServiceProxy(UserServiceImpl userServiceImpl){
		this.usi=userServiceImpl;	
	}
	public void add() throw Exception{
 		check();
		usi.add();
		log();
	}
	
	public  void  check(){
		System.out.println("权限检查");
	}
	
	public  void  log(){
		System.out.println("日志记录");
	}

}
```

2.实现类UserServiceImpl代码改动

```
public void add() throw Exception{	
	System.out.println("添加成功");
}
```

3.存在问题：

第二阶段的静态代理，将UserServiceImpl实现类中的横切性代码提取出来 放到代理类里，在代理类里做整合。     那么一个service接口就要写一个代理类，如果Service接口特别多的话，程序中将多出非常多的代理类。

解决办法：需要一个代理类，能代理所有实现接口的实现类。这就需要下面的动态代理





## 5.4动态代理实现AOP

### 	5.4.1JDK动态代理实现AOP

1.动态代理的分类：
	2.1 JDK动态代理---代理拥有接口的实现类
	2.2 cglib动态代理---代理拥有父类的子类

2.动态代理:
	3.1 底层是根据反射实现的.
	3.2 只要给代理对象传递被代理对象,直接调用被代理对象中方法

3.动态代理中动态含义
	3.1 代理类可以代理任意类型对象.(被代理对象必须实现了指定接口)

4.实现步骤:

​	4.1.创建动态代理类：

```
//使用动态代理时需要实现InvocationHandler,因为在调用者中通过接口调用方法时知道需要执行哪个方法
public class JDKProxy implements InvocationHandler {

	private Object targetObject;//代理的目标对象		
    
	//产生代理对象：
	public Object createProxyInstance(Object targetObject){
		this.targetObject=targetObject;
/**
 * 参数一     ClassLoader   类加载器
 * 参数二：   Interfaces  接口类型
 * 参数三：   InvocationHandler  代理对象
 * */
		 return Proxy.newProxyInstance(
		 	this.targetObject.getclass().getClassLoader(),
		 	this.targetObject.getclass().getInterfaces(),
			this);
	}
	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		check();
    	Object invoke = method.invoke(this.targetObject, args);
		log();
    	return invoke;
	}

	public  void  check(){
		System.out.println("权限检查");
	}
	
	public  void  log(){
		System.out.println("日志记录");
	}

}
```

​	4.2创建测试类：

```
JDKProxy jdkProxy=new JDKProxy();

	//给UserService接口创建临时代理对象userService
UserService userService=(UserService)jdkProxy.createProxyInstance(new UserServiceImpl());

	//调用JDKProxy中invoke方法,把UserServiceImpl.add()方法赋值给invoke方法第二个参数Method,还会add()方法参数赋值   //invoke()方法第三个参数Object,执行invoke方法.
UserService.add();
```

5.存在问题：

   JDK动态代理的产生必须要实现对应的接口的，如果没有对应的接口，这个时候代理对象就没有办法产生。







### 5.4.2CGLIB动态代理实现AOP

实现步骤：

1.创建父类

```
public abstract   class UserSuper {

   public  abstract   void add();
}
```

2.创建子类

```
public class UserSub extends UserSuper{
	public void add(){
		System.out.println("添加成功！");	
	}
}
```

3.创建动态代理类

```
public class CGLibProxy implements MethodInterceptor{

	private Object targetObject;//代理的目标对象	
	
	//产生代理对象：
	public Object createProxyInstance(Object targetObject){
		this.targetObject=targetObject;
		 Enhancer  en=new Enhancer();//该类用于生成子类的代理对象
		 en.setSuperclass(this.targetObject.class); //设置父类
		 en.setCallback(this); //设置回滚函数
		 return en.create();
	}

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
       	check(); 
        Object o1 = methodProxy.invokeSuper(o, objects);
        log();
        return o1;
    }
    
    public  void  check(){
		System.out.println("权限检查");
	}
	
	public  void  log(){
		System.out.println("日志记录");
	}
}
```

4.创建测试类

```
    CGLibProxy   cgLibProxy =new CGLibProxy();
    UserSuper userSuper = (UserSuper) cgLibProxy.createProxyInstance(new UserSub());
    userSuper.add();
```

5.存在问题：

​	横切行代码最好还是存放在一个单独的类里面去，然后借助动态代理，在作用在代理类对象上。

​	Spring提供了两种切面声明方式，实际工作中我们可以选择其中一种：
​		A)	基于XML配置方式声明切面
​		B)	基于注解方式声明切面







# 六.基于XML配置方式声明切面  

​	**实现Spring AOP的过程,就是告诉Spring哪些方法需要形成切面**

代码实现

1.添加依赖

```
   <dependencies>
        <!--进行junit单元测试 -->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.11</version>
            <scope>test</scope>
        </dependency>

        <!--依赖于commons-logging日志管理 -->
        <dependency>
            <groupId>commons-logging</groupId>
            <artifactId>commons-logging</artifactId>
            <version>1.2</version>
        </dependency>

        <!--提供了框架的基本组成部分,包括IOC 和 DI-->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-core</artifactId>
            <version>4.1.6.RELEASE</version>
        </dependency>

        <!-- 提供了BeanFactory-->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-beans</artifactId>
            <version>4.1.6.RELEASE</version>
        </dependency>

        <!--上下文配置对象，提供一个框架式的对象访问方式-->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>4.1.6.RELEASE</version>
        </dependency>

        <!--提供了强大的表达式语言-->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-expression</artifactId>
            <version>4.1.6.RELEASE</version>
        </dependency>

<!-- ====注解式声明切面  -->
        <dependency>
            <groupId>org.aspectj</groupId>
            <artifactId>aspectjweaver</artifactId>
            <version>1.9.1</version>
        </dependency>
 </dependencies>
```

2.定义切面类：

```
public class Advice {
  
    public void check(){
        System.out.println("权限检查");
    }

    public void log(){
        System.out.println("日志记录");
    }
}
```

3.编写业务代码：

```
public interface UserService {
    void add() throws Exception;
    void delete() throws Exception;
}
```

```
public class UserServiceImpl implements UserService {
    public void add() throws Exception {
        System.out.println("添加User成功");
    }

    public void delete() throws Exception {
        System.out.println("删除User成功");
    }
}
```

4.编写applicationContext.xml配置文件

===引入一个命名空间： aop

```
 	   xmlns:aop="http://www.springframework.org/schema/aop"      
       
       http://www.springframework.org/schema/aop
	   http://www.springframework.org/schema/aop/spring-aop-4.3.xsd
    <!--创建业务实现类对象 -->
    <bean id="usi" class="com.msb.aop.aspectj.UserServiceImpl"/>

    <!--创建切面类对象 -->
    <bean id="advice" class="com.msb.aop.aspectj.Advice"/>

    <!-- <aop:config proxy-target-class="true"> 如果这样配置则是强制使用CGLIB方式进行代理
            不写或者设置为false默认使用 ： jdk方式进行代理  -->
<aop:config>
   <aop:aspect ref="advice">
      <!--定义切点： -->
      <aop:pointcut id="addpointcut" expression="execution(* com.msb.aop.aspectj.UserServiceImpl.add*(..))"/>
      <!--定义通知 -->
      <aop:before method="check" pointcut-ref="addpointcut"/>

      <aop:after method="log" pointcut="execution(* com.msb.aop.aspectj.UserServiceImpl.add*(..))"/>
   </aop:aspect>

</aop:config>
```

5.编写测试代码：

```
    @Test
    public void test5() throws Exception {

        ApplicationContext app=new ClassPathXmlApplicationContext("applicationAOP.xml");
       	UserService userService=(UserService)app.getBean("usi");
        userService.add();
        userService.delete();
    }
    运行结果：
    	权限检查
		添加User成功
		日志记录
		删除User成功
```





2.介绍execution表达式

![12](文档图片\12.png)

Execution表达式语法：

​	execution(<修饰符模式>？<返回类型模式><方法名模式>（<参数模式>）)<异常模式>？)

​	除了返回类型模式，方法名模式和参数模式外，其他项都是可选的。

execution（public * * (..)）

​	匹配所有目标类的public方法，第一个 * 代表返回类型，第二个 * 代表方法名，而 .. 代表任意入参方法；

execution（ * *To (..)）

​	匹配目标类所有以To为后缀的方法，第一个 * 代表返回类型，而 * To代表任意以To为后缀的方法；

execution（ * com.msb.UserService.* (..)）

​	匹配UserService接口的所有方法，第一个 * 代表返回任意类型，com.msb.UserService.*代表UserService接口中的所有方法；

execution（ * com.msb.* (..)）

​	匹配com.msb包下所有类的所有方法

execution（ * com.msb..* (..)）

​	匹配com.msb包，子孙包下所有类的所有方法，“..”出现在类名中时，后面必须跟“*”，表示包，子孙包下的所有类；

execution（ * com.msb.. * .*Dao.find * (..)）

​	匹配包名前缀为com.msb的任何包下类名后缀为Dao的方法，方法名必须以find为前缀。





# 七.基于注解方式声明切面

实现步骤：

1.添加依赖

```
    <dependencies>
        <!--进行junit单元测试 -->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.11</version>
            <scope>test</scope>
        </dependency>

        <!--依赖于commons-logging日志管理 -->
        <dependency>
            <groupId>commons-logging</groupId>
            <artifactId>commons-logging</artifactId>
            <version>1.2</version>
        </dependency>

        <!--提供了框架的基本组成部分,包括IOC 和 DI-->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-core</artifactId>
            <version>4.1.6.RELEASE</version>
        </dependency>

        <!-- 提供了BeanFactory-->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-beans</artifactId>
            <version>4.1.6.RELEASE</version>
        </dependency>

        <!--上下文配置对象，提供一个框架式的对象访问方式-->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>4.1.6.RELEASE</version>
        </dependency>

        <!--提供了强大的表达式语言-->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-expression</artifactId>
            <version>4.1.6.RELEASE</version>
        </dependency>

<!-- ====注解式声明切面  -->
        <dependency>
            <groupId>org.aspectj</groupId>
            <artifactId>aspectjweaver</artifactId>
            <version>1.9.1</version>
        </dependency>
 </dependencies>   
```

2.定义切面类：

```
@Aspect
@Component
public class Advice {

    @Before("execution(* com.msb.aop.aspectj.UserServiceImpl.add*(..))")
    public void check(){
        System.out.println("权限检查");
    }

    @After("execution(* com.msb.aop.aspectj.UserServiceImpl.add*(..))")
    public void log(){
        System.out.println("日志记录");
    }

}
```

3.编写业务代码：

```
public interface UserService {
    void add() throws Exception;
    void delete() throws Exception;
}
```

```
@Service
public class UserServiceImpl implements UserService {
    public void add() throws Exception {
        System.out.println("添加User成功");
    }

    public void delete() throws Exception {
        System.out.println("删除User成功");
    }
}
```

4.编写applicationContext.xml配置文件

===引入两个命名空间：context 和 aop

```
 	   xmlns:aop="http://www.springframework.org/schema/aop"
       xmlns:context="http://www.springframework.org/schema/context"
       
       http://www.springframework.org/schema/aop
	   http://www.springframework.org/schema/aop/spring-aop-4.3.xsd
	   http://www.springframework.org/schema/context
	   http://www.springframework.org/schema/context/spring-context-4.3.xsd
	   
    	<!-- 扫描指定路径，自动注入注解-->
    <context:component-scan base-package="com.msb"/>
   	 	<!--自动为spring容器中那些配置@aspectJ切面的bean创建代理，
    	有一个proxy-target-class属性，默认为false 那么标准的JDK 基于接口的代理将起作用。
    	不过即使proxy-target-class设置为false，如果目标类没有声明接口，则spring将自动使用CGLib动态代理。-->
    <aop:aspectj-autoproxy/>
```

5.编写测试代码：

```
    @Test
    public void test5() throws Exception {

        ApplicationContext app=new ClassPathXmlApplicationContext("applicationAOP.xml");
       	UserService userService=(UserService)app.getBean("userServiceImpl");
        userService.add();
        userService.delete();
    }
    运行结果：
    	权限检查
		添加User成功
		日志记录
		删除User成功
```







# 八.Spring中注解的支持


Spring的常见注解及其作用: 

1. @Component 创建类对象,相当于配置<bean/> 
               bean的ID默认为类名首字母小写,也可以指定ID,例如@Component("stu") 
2. @Service 与@Component功能相同. 
2.1 写在ServiceImpl类上. 
3. @Repository 与@Component功能相同. 
3.1 写在数据访问层类上. 
4. @Controller 与@Component功能相同. 
4.1 写在控制器类上. 
5. @Resource(不需要写对象的get/set) 
5.1 java中的注解 
5.2 默认按照 名称
注入,如果没有名称对象,按照byType注入 
5.2.1 建议把对象名称和spring容器中对象名相同 
6. @Autowired(不需要写对象的get/set) 
6.1 spring的注解 
6.2 默认按照byType注入. 
7. @Value() 获取properties文件中内容 
8. @Pointcut() 定义切点 
9. @Aspect() 定义切面类 
10. @Before() 前置通知 
11. @After 后置通知 
12. @AfterReturning 后置通知,必须切点正确执行 
13. @AfterThrowing 异常通知 
14. @Arround 环绕通知 
注意:      

```
  使用注解,一定要在配置文件中声明注解扫描 
  <context:component-scan base-package="包名路径"></context:component-scan>         
  <aop:aspectj-autoproxy></aop:aspectj-autoproxy> 
```







# 九.Spring整合MyBatis的实现

A.	导入Spring和MyBatis的jar包依赖：

```
 
<dependencies>


    <!-- mybatis核心包-->
    <dependency>
        <groupId>org.mybatis</groupId>
        <artifactId>mybatis</artifactId>
        <version>3.5.3</version>
    </dependency>

    <!-- mysql驱动包 -->
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>5.1.8</version>
    </dependency>

    <!-- 日志包，方便看sql语句 -->
    <dependency>
        <groupId>org.slf4j</groupId>
        <artifactId>slf4j-log4j12</artifactId>
        <version>1.6.1</version>
    </dependency>



    <!--进行junit单元测试 -->
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.11</version>
        <scope>test</scope>
    </dependency>

    <!--依赖于commons-logging日志管理 -->
    <dependency>
        <groupId>commons-logging</groupId>
        <artifactId>commons-logging</artifactId>
        <version>1.2</version>
    </dependency>

    <!--提供了框架的基本组成部分,包括IOC 和 DI-->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-core</artifactId>
        <version>4.1.6.RELEASE</version>
    </dependency>

    <!-- 提供了BeanFactory-->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-beans</artifactId>
        <version>4.1.6.RELEASE</version>
    </dependency>

    <!--上下文配置对象，提供一个框架式的对象访问方式-->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>4.1.6.RELEASE</version>
    </dependency>

    <!--提供了强大的表达式语言-->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-expression</artifactId>
        <version>4.1.6.RELEASE</version>
    </dependency>
    <!-- ====注解式声明切面  -->
    <dependency>
        <groupId>org.aspectj</groupId>
        <artifactId>aspectjweaver</artifactId>
        <version>1.9.1</version>
    </dependency>


    <!--整合Spring + Mybatis -->
    <dependency>
        <groupId>org.mybatis</groupId>
        <artifactId>mybatis-spring</artifactId>
        <version>1.3.0</version>
    </dependency>

    <!-- 导入dbcp的jar包，用来在spring-mybatis.xml中配置数据库 -->
    <dependency>
        <groupId>commons-dbcp</groupId>
        <artifactId>commons-dbcp</artifactId>
        <version>1.4</version>
    </dependency>

    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-tx</artifactId>
        <version>4.3.18.RELEASE</version>
    </dependency>

    <!--对Spring 对JDBC 数据访问进行封装的所有类-->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-jdbc</artifactId>
        <version>4.1.6.RELEASE</version>
    </dependency>
</dependencies>

```

B.resources下添加log4j.properties 

C.resources下新建applicationContext.xml

```
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/aop
	   http://www.springframework.org/schema/aop/spring-aop-4.3.xsd
	   http://www.springframework.org/schema/context
	   http://www.springframework.org/schema/context/spring-context-4.3.xsd">

<!--配置数据源 -->
<bean id="dataSource" class="org.apache.commons.dbcp.BasicDataSource">
    <property name="driverClassName" value="com.mysql.jdbc.Driver"></property>
    <property name="url" value="jdbc:mysql://127.0.0.1:3306/test"></property>
    <property name="username" value="root"></property>
    <property name="password" value="root"></property>
</bean>

<!-- 管理sqlsessionFactory对象 -->
<bean id="factory" class="org.mybatis.spring.SqlSessionFactoryBean">
    <property name="dataSource" ref="dataSource"></property>
</bean>   

<!--配置mapper扫描器 -->
<bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
    <property name="basePackage" value="com.msb.mapper"></property>
    <property name="sqlSessionFactoryBeanName" value="factory"></property>
</bean>

<!--配置注解扫描路径 -->
<context:component-scan base-package="com.msb"/>

</beans>
```

D.使用逆向工程生成pojo实体类，mapper接口，mapper.xml映射文件：实现删除，添加，查询全部功能！

```
@Component
public class Dept {
    private Integer deptno;

    private String dname;

    private String loc;

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc == null ? null : loc.trim();
    }
}
```

```
public interface DeptMapper {


    int insertDept(Dept record);

    int deleteDept(int deptno);

    List<Dept> selectAll();
}
```

```
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd" >
<mapper namespace="com.msb.mapper.DeptMapper" >

    <insert id="insertDept" parameterType="com.msb.pojo.Dept">
        insert into dept values(#{deptno},#{dname},#{loc})

    </insert>

    <delete id="deleteDept" parameterType="int">

        delete from dept where deptno=#{id}
    </delete>

    <select id="selectAll" resultType="com.msb.pojo.Dept">
        select * from dept
    </select>

</mapper>
```

E.创建service接口和实现类

```
public interface DeptService {

    int addDept(Dept dept) throws Exception;

    int removeDept(int id) throws Exception;

    List<Dept> findAll() throws Exception;
}
```

```
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    public DeptMapper getDeptMapper() {
        return deptMapper;
    }

    public void setDeptMapper(DeptMapper deptMapper) {
        this.deptMapper = deptMapper;
    }

    public int addDept(Dept dept) throws Exception {
      return deptMapper.insertDept(dept);
    }

    public int removeDept(int id) throws Exception {
        return deptMapper.deleteDept(id);
    }

    public List<Dept> findAll() throws Exception {
        return deptMapper.selectAll();
    }
}
```

F.创建测试方法，运行结果：

```
public class SpringTest {

    @Test
    public void test1() throws Exception {

        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptService deptService=(DeptService) app.getBean("deptServiceImpl");
        List<Dept> list =deptService.findAll();
        for (Dept d:list){
            System.out.println(d.getDeptno()+";"+d.getDname()+";"+d.getLoc());
        }
    }
    
    @Test
    public void test2() throws Exception {

        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptService deptService=(DeptService) app.getBean("deptServiceImpl");
        int i=deptService.removeDept(31);
        System.out.println(i==1?"删除成功":"删除失败");
    }
}


```









# 十.Spring中TX事务管理

## A.事务的特性

​	事务要么整体生效，要么整体失效。在数据库上即使多条SQL语句要么全执行成功，要么全执行失败！





## B.事务的四个原则

​	1.原子性（atomicity）：一个事务必须视为一个不可分割的最小工作单元，整个事务中的所有操作要么全部提交成功，要么全部失败回												滚，对于一个事务来说，不可能只执行其中的一部分操作，这就是事务的原子性。 

​	2.一致性（consistency）：数据库总数从一个一致性的状态转换到另一个一致性的状态。 

​	3.隔离性（isolation）：一个事务所做的操作（添加、修改、删除）在最终提交以前，对其他事务是不可见的。 

​	4.持久性（durability）：一旦事务提交，则其所做的操作（添加、修改、删除）就会永久保存到数据库中。此时即使系统崩溃，修改												的数据也不会丢失。 





## C.事务并发问题

​	在实际开发中数据库操作一般都是并发执行的，即有多个事务并发执行，并发执行就可能遇到问题，目前常见的问题如下：

​	1） 脏读: 
 			一个事务(A)读取到另一个事务(B)中未提交的数据,另一个事务中数据可能进行了改变,此时A事务读取的数据可能和数据库中数据是		不一致的,此时认为数据是脏数据,读取脏数据过程叫做脏读. 

​	2） 不可重复读: 
​			 主要针对的是某行数据.(或行中某列) 
​			 主要针对的操作是修改操作. 
​			 两次读取在同一个事务内 
​			 当事务A第一次读取数据后,事务B对事务A读取的数据进行修改,事务A中再次读取的数据和之前读取的数据不一致,过程不可重复读. 

​	3） 幻读: 
​			 主要针对的操作是新增或删除 
​			 两次事务的结果. 
​			 事务A按照特定条件查询出结果,事务B新增了一条符合条件的数据.事务A中查询的数据和数据库中的数据不一致的,事务A好像出现		了幻觉,这种情况称为幻读. 

​	4）丢失更新：

​			两个事务同时更新一行数据，最后一个事务的更新会覆盖掉第一个事务的更新，从而导致第一个事务更新的数据丢失，这是由于没		有加锁造成的。

**那在多线程或并发访问下如何保证访问到的数据具有完整性呢？** 

使用事务的 isolation="" 事务隔离级别 

 DEFAULT: 默认值,由底层数据库自动判断应该使用什么隔离界别 

 READ_UNCOMMITTED: 可以读取未提交数据,可能出现脏读,不重复读,幻读. 
	=== 效率最高. 

 READ_COMMITTED:只能读取其他事务已提交数据.可以防止脏读,可能出现不可重复读和幻读. 

 REPEATABLE_READ: 读取的数据被添加锁,防止其他事务修改此数据,可以防止不可重复读.脏读,可能出现幻读. 

 SERIALIZABLE: 排队操作,对整个表添加锁.一个事务在操作数据时,另一个事务等待事务操作完成后才能操作这个表. 
	=== 最安全的 
	=== 效率最低的. 







## D.Spring事务传播策略

 	当一个具有事务控制的方法被另一个有事务控制的方法调用后,需要如何管理事务(新建事务?在事务中执行?把事务挂起?报异常?) 

事务的隔离级别是数据库本身的事务功能，然而事务的传播策略则是Spring自己为我们提供的功能，数据库事务没有事务传播策略这一说法

​	propagation 控制事务传播行为. 

1. REQUIRED (默认值): 如果当前有事务,就在事务中执行,如果当前没有事务,新建一个事务. ==增，删，改方法

2. SUPPORTS:如果当前有事务就在事务中执行,如果当前没有事务,就在非事务状态下执行. ==查询。

3. MANDATORY:必须在事务内部执行,如果当前有事务,就在事务中执行,如果没有事务,报错. 

4. REQUIRES_NEW:必须在事务中执行,如果当前没有事务,新建事务,如果当前有事务,把当前事务挂起 
5. NOT_SUPPORTED:必须在非事务下执行,如果当前没有事务,正常执行,如果当前有事务,把当前事务挂起  
6. NEVER:必须在非事务状态下执行,如果当前没有事务,正常执行,如果当前有事务,报错. 

7. NESTED:必须在事务状态下执行.如果没有事务,新建事务,如果当前有事务,创建一个嵌套事务. 







## E.Xml配置声明式事务

 	   我们之前学习mybatis 的时候我们使用的事务和JDBC的事务是一致的，但是我们现在学习的mybatis 结合Spring 以后，这个时候是如何管理事务的？

1.事务的分类：
编程式事务
    整个事务的管理都是程序员自己书写的代码进行的控制 如：获取事务对象，设置事务隔离级别，传播策略，开启，提交，回滚等。
声明式事务  
     现在整个事务管理已经做好了，如果我们想要使用事务，只要在我们自己的程序中进行声明配置即可    

​	 声明式事务分为两种：Xml配置声明式事务

​											注解配置声明式事务

2.事务使用的条件：

 	在一个业务中执行两条或者两条以上的增删改操作的时候

3.事务的配置

A)	切点：增加事务的方法
B)	通知：---事务
C)	织入切面

4.实现步骤: 基于Spring整合Mybatis例子!



1.修改service接口和实现类

```
 public  int addRemoveFindDept(Dept dept,int id) throws Exception;
```

```
    public int addRemoveDept(Dept dept, int id) throws Exception {
       int i= deptMapper.insertDept(dept);
       i=i+deptMapper.deleteDept(id);
       return i;
    }
```

2.编写applicationContext.xml配置文件

```
 	   xmlns:tx="http://www.springframework.org/schema/tx"
       
	   http://www.springframework.org/schema/tx
	   http://www.springframework.org/schema/tx/spring-tx-4.3.xsd

<!--声明事务管理的对象-->
<bean id="txManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
    <property name="dataSource" ref="dataSource"></property>
</bean>

<!--事务的通知-->
<tx:advice id="txAdvice" transaction-manager="txManager">
    <tx:attributes>
        <tx:method name="add*" propagation="REQUIRED"/>
        <tx:method name="remove*" propagation="REQUIRED"/>
        <tx:method name="find*" propagation="SUPPORTS"/>
    </tx:attributes>
</tx:advice>

<--配置TX声明式事务-->
<aop:config>    
    <aop:pointcut id="pt2" expression="execution(* com.msb.service.impl.DeptServiceImpl.*(..))"/>			
    <aop:advisor advice-ref="txAdvice" pointcut-ref="pt2"></aop:advisor>    
</aop:config>
```

​	



**注意：**
​		我们使用Spring 中的声明式事务的时候一定注意，不要自己捕捉异常





## F.注解配置声明式事务

实现步骤:

1.编写applicationContext.xml配置文件

```
 	   xmlns:tx="http://www.springframework.org/schema/tx"
       
	   http://www.springframework.org/schema/tx
	   http://www.springframework.org/schema/tx/spring-tx-4.3.xsd

<!--声明事务管理的对象-->
<bean id="txManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
    <property name="dataSource" ref="dataSource"></property>
</bean>
<!--事务的通知-->
<tx:annotation-driven transaction-manager="txManager"/>

```

2.修改ServiceImpl实现类代码：

```
@Service
@Transactional(propagation = Propagation.REQUIRED)
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    public DeptMapper getDeptMapper() {
        return deptMapper;
    }

    public void setDeptMapper(DeptMapper deptMapper) {
        this.deptMapper = deptMapper;
    }

    public int addDept(Dept dept) throws Exception {
      return deptMapper.insertDept(dept);
    }

    public int removeDept(int id) throws Exception {
        return deptMapper.deleteDept(id);
    }

    public List<Dept> findAll() throws Exception {
        return deptMapper.selectAll();
    }
}
```



