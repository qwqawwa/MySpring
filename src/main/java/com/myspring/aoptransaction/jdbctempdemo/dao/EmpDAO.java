package com.myspring.aoptransaction.jdbctempdemo.dao;

import com.myspring.aoptransaction.jdbctempdemo.bean.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @projectName: MySpring
 * @package: com.myspring.aoptransaction.jdbctempdemo.dao
 * @className: EmpDAO
 * @author: ChengLiu
 * @description: 员工DAO类
 * @date: 02/05/2023 8:48 pm
 */
@Repository
public class EmpDAO implements IEmpDAO {
    //要使用DAO来完成JDBC Template操作
    // 1.配置component scan，开启要扫描哪个包路径
    // 2.DAO要用@Repository注解，标明作为一个SPring bean
    // 3.使用JDBCTemplate,并将依赖的JDBCTemplate自动注入
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void save(Emp emp) {
        String insertSQL = "INSERT INTO EMP(empno,ename) values (?,?)";//？为占位符
        //insert操作，使用的api还是update(SQL语句，可变参数)，其实增删改用的api都是update
        int result = jdbcTemplate.update(insertSQL, emp.getEmpno(), emp.getEname());//返回result是影响的条数
        System.out.println(result);
    }
}
