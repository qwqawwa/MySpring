package aoptransaction;

import com.myspring.aoptransaction.service.BookService;
import com.myspring.aoptransaction.service.MulService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.print.Book;
import java.io.FileNotFoundException;

/**
 * @projectName: MySpring
 * @package: aoptransaction
 * @className: transactionTest
 * @author: ChengLiu
 * @description: TODO
 * @date: 06/05/2023 4:46 pm
 */
public class TransactionTest {

    String XML_PATH = "aoptransaction/JDBCTemplate.xml";

    @Test
    public void txTest() throws FileNotFoundException {
        ApplicationContext context = new ClassPathXmlApplicationContext(XML_PATH);
        BookService bookService = context.getBean("bookService", BookService.class);
        //减库存+减账号余额
        bookService.checkout("zhangsan", 1);
    }

    @Test
    public void propagationRequiredTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(XML_PATH);
        MulService mulService = context.getBean("mulService", MulService.class);
        //1.mulService.mulTx()为最外部方法，并且设置@Transactional,里面又调用了两个其他方法，也各自有@Transactional；
        // 在使用Required传播特性时，那么所有的事务都会统一成一个事务，一旦发生错误(哪怕是被try catch捕获也是一样)，所有的数据都要进行回滚
        // 2.把mulService.mulTx()最外部方法，@Transactional去掉，此时调用的bookservice的两个方法为平级方法，这个时候就会发现两个事务不再统一了
        mulService.mulTx();
    }

    @Test
    public void propagationRequiredNewTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(XML_PATH);
        MulService mulService = context.getBean("mulService", MulService.class);
        //1.mulService.mulTx()为最外部方法，并且设置@Transactional,里面又调用了两个其他方法，也各自有@Transactional；
        // 此时，两个方法一个使用Required传播特性，一个使用RequiresNew传播特性（报错代码写这个方法里），
        // a.首先,RequiresNew传播特性的那个方法，作为一个单独的事务，因为有异常，所以事务回滚，数值没变化
        // b.另外一个方法，使用Required传播特性，因为有外层事务，所以看外层事务的结果，对于最外层事务而言，他也是报错了的（因为有一个方法异常了），
        // 所以控制整个事务下都回滚，所以当前使用Required传播特性的方法，事务回滚，数值没变化
        //
        //2.其他条件与1相同，只是报错的代码替换一下位置，写在使用Required传播特性的方法里
        //结果：
        // a.首先，RequiresNew传播特性的那个方法，作为一个单独的事务，没有异常，正常提交事务，数据变化
        // b.另外一个方法，使用Required传播特性，因为有外层事务，所以看外层事务的结果，对于最外层事务而言，他也是报错了的（因为当前方法就异常了），
        //        // 所以控制整个事务下都回滚，所以当前使用Required传播特性的方法，事务回滚，数值没变化
        //
        //3.其他条件与1相同，只是在对异常方法里加入try catch 异常的处理
        // a.首先，RequiresNew传播特性的那个方法，作为一个单独的事务，存在异常，虽然try catch捕获了，捕获意味着可以继续执行，但是出现异常，
        // 还是会回滚事务，数据不变
        // b.另外一个方法，使用Required传播特性，因为有外层事务，所以看外层事务的结果，对于最外层事务而言，
        //   存在异常，但是try catch被内部方法捕获了，意味着对于外部方法来说没问题，正常提交事务，数据变化。
        //
        //5.其他条件与3相同，只是把两个内部方法都设置为Required传播特性
        // a.如果外层方法存在事务时，REQUIRED会和外层方法使用同一个事务，而NESTED会创建一个嵌套的子事务，这两种方式最重要的区别就在这里：
        // 如果内层方法抛出异常，当使用REQUIRED方式时，即使在外层方法捕获了该异常，也依然会导致外层事务回滚（因为使用的是同一个事务）；
        // 而如果使用NESTED或REQUIRES_NEW的方式，只要在外层方法捕获了该异常，就不会导致外层事务回滚（因为内部的事务是嵌套）
        //
        // 还有一种方式可以体现RequiresNew和Nested的差别：在外部方法里报错（分别试一下带try catch和不带）
        // RequiresNew 是完全不会受外部影响的
        // 但是Nested会受外部影响，因为它是嵌套事务，他仍然依赖于外部事务
        //
        //4.其他条件与1相同，只是两个方法都使用RequiresNew传播特性
        // a.RequiresNew传播特性的两个方法，都作为一个单独的事务，
        // b.但是要看执行顺序，如果现正常执行完一个方法，再第二个方法出异常，则出异常那个回滚；不出异常的那个正常提交，数据变化
        // c.但是如果第一个方法就出了异常，其实第二个方法也不会数据变化
        mulService.mulTx();
    }

    @Test
    public void propagationNotSupportTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(XML_PATH);
        MulService mulService = context.getBean("mulService", MulService.class);
        mulService.mulTx();
    }
}
