package com.myspring.dao;

import com.myspring.bean.Student;
import org.springframework.stereotype.Repository;

/**
 * @ClassName StudentDao
 * @Description TODO
 * @Author Cheng Liu
 * @Date 03/11/2022 8:56 PM
 */
@Repository
public class StudentDao extends BaseDao<Student> {
    public void save(){
        System.out.println("Student Dao Save");
    }
}