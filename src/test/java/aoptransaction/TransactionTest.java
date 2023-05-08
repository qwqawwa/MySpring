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
        // 在使用Required传播特性时，那么所有的事务都会统一成一个事务，一旦发生错误，所有的数据都要进行回滚
        // 2.把mulService.mulTx()最外部方法，@Transactional去掉，此时调用的bookservice的两个方法为平级方法，这个时候就会发现两个事务不再统一了
        mulService.mulTx();
    }
}
