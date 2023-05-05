package aoptransaction;

import com.alibaba.druid.pool.DruidDataSource;
import com.myspring.aoptransaction.jdbctempdemo.bean.Emp;
import com.myspring.aoptransaction.jdbctempdemo.dao.EmpDAO;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @projectName: MySpring
 * @package: aoptransaction
 * @className: JDBCTest
 * @author: ChengLiu
 * @description: TODO
 * @date: 02/05/2023 9:46 pm
 */
public class JDBCTest {
    String XML_PATH = "aoptransaction/JDBCTemplate.xml";

    @Test
    public void connectionTest() throws SQLException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(XML_PATH);
        DruidDataSource dataSource = context.getBean("dataSource", DruidDataSource.class);
        System.out.println(dataSource.getConnection());
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
        System.out.println(jdbcTemplate);
    }

    /**
     * 使用JDBCTemplate:增
     */
    @Test
    public void insertTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(XML_PATH);
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);

        String insertSQL = "INSERT INTO EMP(empno,ename) values (?,?)";//？为占位符
        //insert操作，使用的api还是update(SQL语句，可变参数)，其实增删改用的api都是update
        int result = jdbcTemplate.update(insertSQL, 1, "xiaoming");//返回result是影响的条数
        System.out.println(result);
    }

    /**
     * 使用JDBCTemplate:批量增
     */
    @Test
    public void batchInsertTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(XML_PATH);
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);

        String insertSQL = "INSERT INTO EMP(empno,ename) values (?,?)";//？为占位符
        ArrayList<Object[]> objects = new ArrayList<>();
        objects.add(new Object[]{2, "xiaohong"});
        objects.add(new Object[]{3, "daming"});
        objects.add(new Object[]{4, "dagang"});
        //批量insert操作，batchUpdate(SQL语句，Object数组的List)
        int[] result = jdbcTemplate.batchUpdate(insertSQL, objects);//返回result是影响的条数
        System.out.println(Arrays.asList(result));
    }

    /**
     * 使用JDBCTemplate:删
     */
    @Test
    public void deleteTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(XML_PATH);
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);

        String deleteSQL = "DELETE FROM EMP WHERE ename = ?";//？为占位符
        //delete操作，使用的api还是update(SQL语句，可变参数)，其实增删改用的api都是update
        int result = jdbcTemplate.update(deleteSQL, "xiaoming");
        System.out.println(result);
    }

    /**
     * 使用JDBCTemplate:改
     */
    @Test
    public void UpdateTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(XML_PATH);
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);

        String updateSQL = "UPDATE EMP SET ename = 99  WHERE ename = ?";//？为占位符
        //delete操作，使用的api还是update(SQL语句，可变参数)，其实增删改用的api都是update
        int result = jdbcTemplate.update(updateSQL, "xiaohong");
        System.out.println(result);
    }

    /**
     * 使用JDBCTemplate:查
     */
    @Test
    public void SelectTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(XML_PATH);
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);

        String selectSQL = "SELECT * FROM EMP WHERE SAL > ?";//？为占位符
        //查找操作使用的是query方法
        List<Emp> result = jdbcTemplate.query(selectSQL, new BeanPropertyRowMapper<>(Emp.class), 800);
        System.out.println(result);
    }

    @Test
    public void DaoTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(XML_PATH);
        EmpDAO empDAO = context.getBean("empDAO", EmpDAO.class);
        Emp emp = new Emp();
        emp.setEmpno(100);
        emp.setEname("大蓝");
        empDAO.save(emp);
    }


}
