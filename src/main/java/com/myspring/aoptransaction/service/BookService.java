package com.myspring.aoptransaction.service;

import com.myspring.aoptransaction.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @projectName: MySpring
 * @package: com.myspring.aoptransaction.service
 * @className: BookService
 * @author: ChengLiu
 * @description: TODO
 * @date: 06/05/2023 4:44 pm
 */
@Service
public class BookService {
    @Autowired
    BookDao bookDao;


    /**
     * 结账：传入哪个用户买了哪本书
     *
     * @param username
     * @param id
     */
    /*
     * @Transactional的可用属性：
     * 1.propagation:传播特性
     * 2.isolation: 隔离级别
     * 3.timeout: 超时时间。单位为秒，超出设置时间后，则出异常，并回滚事务
     * 4.readonly: 设置只读事务。开启后就是事务运行期间，数据是只读的，不允许修改数据，否则出异常
     *  适用场景：
     *  a.一个事务内比如执行多次查询，查询内容相同，为了数据一致性，打开只读事务
     *  b.都是查询操作，没有删除修改，也不需要删除修改，可以打开只读事务
     * 建议是全部都是查询的情况下开启
     *
     * 5.noRollbackFor: 设置哪些异常不回滚。配置具体的异常类之后，出现该异常，仍然执行完事务，不回滚数据
     * noRollbackForClassName:和noRollbackFor一样，只是填写的是 异常类的完全限定名，String类型名称
     *  但是，和try catch类似的是，出异常的代码后面的数据处理逻辑不会执行
     *
     * 6.RollbackFor: 设置哪些异常才进行回滚。配置具体的异常类之后，出现该异常，才回滚数据；否则仍然执行完事务不回滚
     * RollbackForClassName:和noRollbackFor一样，只是填写的是 异常类的完全限定名，String类型名称
     */
    //@Transactional(timeout = 3)
    //@Transactional(noRollbackFor = {ArithmeticException.class})
    //@Transactional(noRollbackForClassName = "java.lang.ArithmeticException")
    //@Transactional(rollbackForClassName={"java.io.FileNotFoundException"})
    //@Transactional(rollbackFor={ArithmeticException.class})
    @Transactional
    public void checkout(String username, int id) {
        bookDao.updateStock(id);
        int price = bookDao.getPrice(id);
        bookDao.updateBalance(username, price);
        //int i = 1 / 0;
        //FileInputStream fileInputStream = new FileInputStream("aa.txt");
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void updatePrice(int id, int price) {
        bookDao.updatePrice(id, price);
        int i = 1 / 0;
    }
}
