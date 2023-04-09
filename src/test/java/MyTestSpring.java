import com.myspring.annotation.bean.Address;
import com.myspring.annotation.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * @ClassName MyTest
 * @Description TODO
 * @Author Cheng Liu
 * @Date 03/10/2022 9:39 PM
 */
public class MyTestSpring {

   /* 问题：容器中的对象是什么时候创建的
    A：在创建容器完成之前，容器中的对象就已经创建好了*/

    public static void main(String[] args) throws SQLException {
        /*ApplicationContext：表示IOC容器的入口想要获取对象的话，则必须创建该类
        *   该类有两个实现类：
        *   ClassPathXmlApplicationContext ：表示通过xml配置文件的路径来读取数据
        *   FileSystemXmlApplicationContext：标识通过文件系统读取数据（使用较少）*/
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringProperties.xml");

        Person persopn = context.getBean("person", Person.class);
        System.out.println(persopn);

        /*获取bean，还可以使用bean的类型来获取
       但是：如果定义中存在两个bean，id不同，但是类型class相同，初始化时会报错*/

//        Person bean = context.getBean(Person.class);

        Person person6 = context.getBean("person6", Person.class);
        System.out.println(person6.toString());

        Address sonBean = context.getBean("sonBean", Address.class);
        System.out.println("-------------------------------");
        System.out.println(sonBean);
        context.getBean("beanTwo",Address.class);
        context.getBean("beanOne", Person.class);

        /*测试bean作用域*/
        Person singletonPerson = context.getBean("singletonPerson", Person.class);
        Person singletonPerson2 = context.getBean("singletonPerson", Person.class);
        System.out.println(singletonPerson==singletonPerson2);

        /*测试静态工厂生成Bean*/
        Person staticFactoryPerson = context.getBean("staticFactoryPerson", Person.class);
        System.out.println(staticFactoryPerson.toString());

        /*测试实例工厂生成Bean*/
        Person instanceBeanPerson = context.getBean("instanceBeanPerson", Person.class);
        System.out.println(instanceBeanPerson.toString());

        /*测试factory bean的方式生成bean*/
        Person myFactoryBean = context.getBean("MyFactoryBean", Person.class);
        System.out.println(myFactoryBean);

        /*测试bean的初始化和销毁*/
        Person initAndDestoryBean = context.getBean("initAndDestoryBean", Person.class);
        System.out.println(initAndDestoryBean);
        //((ClassPathXmlApplicationContext)context).close();

        /*测试第三方组件：Druid能否正常获得bean及连接*/
      /*  DruidDataSource myDruidBean = context.getBean("MyDruidBean", DruidDataSource.class);
        System.out.println(myDruidBean);
        System.out.println(myDruidBean.getConnection());*/

        /*测试读取properties文件中的配置项*/
        Person propertiesBean = context.getBean("propertiesBean", Person.class);
        System.out.println(propertiesBean);

        /*测试autowire自动装配*/
        Person autowireBean = context.getBean("autowireBean", Person.class);
        System.out.println(autowireBean);

        /*测试SpEL语法*/
        Person spELBean = context.getBean("SpELBean", Person.class);
        System.out.println(spELBean);

    }
}