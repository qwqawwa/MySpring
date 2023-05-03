package com.myspring.xmlconfig.dao;

import com.myspring.xmlconfig.bean.Teacher;
import org.springframework.stereotype.Repository;

/**
 * @ClassName TeacherDao
 * @Description 泛型依赖注入demo:teacher Dao
 * @Author Cheng Liu
 * @Date 16/04/2023 10:34 AM
 */
@Repository
public class TeacherDao extends BaseDao<Teacher> {//继承BaseDao，且实现类必须指定数据类型，比如Teacher

    /*@Autowired
    Teacher teacher;*/
    @Override
    public void save() {
      /*  teacher.setAge(40);
        teacher.setName("凯多老师");
        System.out.println("teacher保存，姓名：" + teacher.getName() + ",年龄：" + teacher.getAge());*/
        System.out.println("老师保存");
    }
}