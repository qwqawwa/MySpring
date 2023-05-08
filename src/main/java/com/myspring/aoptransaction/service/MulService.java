package com.myspring.aoptransaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @projectName: MySpring
 * @package: com.myspring.aoptransaction.service
 * @className: MultiService
 * @author: ChengLiu
 * @description: TODO
 * @date: 07/05/2023 4:20 pm
 */
@Service
public class MulService {
    @Autowired
    private BookService bookService;

    //@Transactional
    public void mulTx() {
        bookService.checkout("zhangsan", 1);
        bookService.updatePrice(1, 1000);
    }
}
