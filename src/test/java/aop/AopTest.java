package aop;

import com.myspring.aop.service.ICalculator;
import com.myspring.aop.service.MyCalculator;
import com.myspring.dynamicbind.mock.service.Calculator;
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
        //若果写：
        // ！！MyCalculator！！ myCalculator = context.getBean("myCalculator", ！！MyCalculator！！.class); 会报错：
        // but was actually of type 'com.sun.proxy.$Proxy14 Exception
        // 改成实现的接口类后，正常执行
        ICalculator myCalculator = context.getBean("myCalculator", ICalculator.class);
        int addResult = myCalculator.add(1, 1);
        System.out.println(addResult);
    }
}