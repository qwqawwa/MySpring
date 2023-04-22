package aop;

import com.myspring.aop.service.MyCalculator;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName AopTest
 * @Description AOP测试类
 * @Author Cheng Liu
 * @Date 22/04/2023 5:09 PM
 */
public class AopTest {
    @Test
    public void aopBasicUseTest() throws NoSuchMethodException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringAOPPreperties.xml");
        MyCalculator myCalculator = context.getBean("myCalculator", MyCalculator.class);
        int addResult = myCalculator.add(1, 1);
        System.out.println(addResult);
    }
}