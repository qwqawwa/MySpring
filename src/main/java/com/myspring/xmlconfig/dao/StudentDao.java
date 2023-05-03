package com.myspring.xmlconfig.dao;

import com.myspring.xmlconfig.bean.Student;
import org.springframework.stereotype.Repository;

/**
 * @ClassName StudentDao
 * @Description 泛型依赖注入demo:Student Dao
 * @Author Cheng Liu
 * @Date 16/04/2023 10:26 AM
 */
@Repository
public class StudentDao extends BaseDao<Student> {//继承BaseDao，且实现类必须指定数据类型，比如Student

    @Override
    public void save() {
       /* student.setAge(1);
        student.setName("小明");
        System.out.println("student保存，姓名：" + student.getName() + ",年龄：" + student.getAge());*/
        System.out.println("学生保存");
    }

}