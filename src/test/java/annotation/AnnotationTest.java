package annotation;

import com.myspring.annotation.controller.PersonController;
import com.myspring.annotation.service.PersonService;
import com.myspring.annotation.service.StudentService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName AnnotationTest
 * @Description TODO
 * @Author Cheng Liu
 * @Date 09/04/2023 11:12 PM
 */
public class AnnotationTest {
    private static final String XML_PATH = "annotation/applicationContext.xml";

    /**
     * 注解的基本使用测试
     */
    @Test
    public void getControllerTest(){
        //牢记ClassPathXmlApplicationContext类，通过xml读取配置
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(XML_PATH);
        //getBean()方法，使用这个overload两个形参的会比较好，bean对象id和需求的类
        PersonController personController = context.getBean("personController", PersonController.class);
        //Object personController = context.getBean("personController");
        System.out.println(personController);

        PersonService personService = context.getBean("personService", PersonService.class);
        PersonService personService1 = context.getBean("personService", PersonService.class);
        System.out.println(personService);
        System.out.println(personService==personService1);
    }

    /**
     * autowired注解基本使用测试
     */
    @Test
    public void autoWiredTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(XML_PATH);
        PersonController personController = context.getBean("personController", PersonController.class);
        personController.eat();
        System.out.println(personController);
    }

    /**
     * autowired注解，与泛型结合使用，泛型依赖注入的测试
     */
    @Test
    public void autoWiredGenericTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(XML_PATH);
        StudentService studentService = context.getBean("studentService", StudentService.class);
        studentService.saveService();
    }
}