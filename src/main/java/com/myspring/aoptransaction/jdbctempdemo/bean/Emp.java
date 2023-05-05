package com.myspring.aoptransaction.jdbctempdemo.bean;

import java.util.Date;

/**
 * @projectName: MySpring
 * @package: com.myspring.aoptransaction.jdbctempdemo.bean
 * @className: Emp
 * @author: ChengLiu
 * @description: 员工Emp bean
 * @date: 02/05/2023 8:46 pm
 */
public class Emp {

    private Integer empno1;
    private String ename;
    private String job;

    private Integer mgr;

    private Date hiredate123;

    private Double sal;

    private Double comm;

    private Integer deptno;

    public Emp() {
    }

    public Emp(Integer empno, String ename, String job, Integer mgr, Date hiredate, Double sal, Double comm, Integer deptno) {
        this.empno1 = empno;
        this.ename = ename;
        this.job = job;
        this.mgr = mgr;
        this.hiredate123 = hiredate;
        this.sal = sal;
        this.comm = comm;
        this.deptno = deptno;
    }

    public Integer getEmpno() {
        return empno1;
    }

    public void setEmpno(Integer empno) {
        this.empno1 = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno1 +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
