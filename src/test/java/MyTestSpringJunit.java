import com.myspring.annotation.controller.PersonController;
import com.myspring.annotation.service.StudentService;
import com.myspring.annotation.service.TeacherService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName MyTestSpringJunit
 * @Description Junit测试类;注意给测试类不要起名为Test，为了不和@Test注解冲突
 * 注意：
 * 1.测试方法不可以有参数
 * 2.不可以有返回值
 * @Author Cheng Liu
 * @Date 23/10/2022 2:29 PM
 */
public class MyTestSpringJunit {

    @Test
    public void myJunitTest(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringIOCProperties.xml");
        //Bean的名称为标注注解的类名，首字母小写；也可以在注解出定义修改bean名称
        /*PersonController personController = context.getBean("personController", PersonController.class);
        System.out.println(personController);*/

        PersonController personControllerCustom = context.getBean("personController", PersonController.class);
        System.out.println(personControllerCustom);

        /*测试@Scope注解*/
        PersonController personControllerCustom2 = context.getBean("personController", PersonController.class);
        System.out.println(personControllerCustom==personControllerCustom2);

        /*测试@Autowired自动注入*/
        PersonController personController = context.getBean("personController", PersonController.class);
        personController.save();

        /*测试@Qualifier注解，在方法上使用，定义bean的id*/
        PersonController personControllerQualifier = context.getBean("personController", PersonController.class);
        personControllerQualifier.save();

        /*@Autowired可以配置在方法上：
        * 1.方法会在bean创建时被调用
        * 2.方法参数列表的参数都会被自动注入*/

        /*测试@Resouce注解，等同于@Autowired
        * 两者的区别：
        * 1.提供的来源不同：@Resource是JDK提供的功能，可以查看import全类名；而@Autowired是Spring提供的注解
        * 2.扩展性的不同：@Resource可以在其他框架使用；@Autowired只能在Spring中使用
        * 3.装配方式不通过：@Resource是按照名称装配的（ByName）,名称找不到，就会按类型找；@Autowired是按照类型装配的，类型找不到，才会按名字来找*/
        PersonController personConResource = context.getBean("personController", PersonController.class);
        personConResource.saveResource();

        /*测试泛型依赖注入
        * 需要补充demo*/
        StudentService studentService = context.getBean("studentService",StudentService.class);
        studentService.save();

        TeacherService teacherService = context.getBean("teacherService",TeacherService.class);
        teacherService.save();

    }
}