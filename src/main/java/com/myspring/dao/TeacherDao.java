package com.myspring.dao;

import com.myspring.bean.Teacher;
import org.springframework.stereotype.Repository;

/**
 * @ClassName TeacherDao
 * @Description TODO
 * @Author Cheng Liu
 * @Date 03/11/2022 8:55 PM
 */
@Repository
public class TeacherDao extends BaseDao<Teacher> {
    public void save(){
        System.out.println("Teacher Dao Save");
    }
}