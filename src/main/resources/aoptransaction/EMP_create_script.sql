create table DEPT
(
    DEPTNO int(2) not null,
    ##部门编号
           DNAME varchar(14),
    #部门名称
           LOC varchar(13) #部门地址
);

alter table DEPT
    add constraint PK_DEPT primary key (DEPTNO);
#设定主键为部门编号

create table EMP
(
    EMPNO int(4) not null,
    #员工编号
          ENAME varchar(10),
    #员工名称
          JOB varchar(9),
    #岗位名称
          MGR int(4),
    #管理人员编号
          HIREDATE date,
    #入职时间
          SAL int(7 ),
    #薪资
          COMM int(7 ),
    #奖金
          DEPTNO int(2) #部门编号
);

alter table EMP
    add constraint PK_EMP primary key (EMPNO);
#设定主键为empno
alter table EMP
    add constraint FK_DEPTNO foreign key (DEPTNO) references DEPT (DEPTNO);
#设定外键关联为depino

insert into DEPT (DEPTNO, DNAME, LOC) values (10, 'ACCOUNTING', 'NEW YORK');#c插入原始数
-据
insert into DEPT (DEPTNO, DNAME, LOC) values (20, 'RESEARCH', 'DALLAS');
insert into DEPT (DEPTNO, DNAME, LOC)
values (30, 'SALES', 'CHICAGO');
insert into DEPT (DEPTNO, DNAME, LOC)
values (40, 'OPERATIONS', 'BOSTON');

insert into EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
values (7369, 'SMITH', 'CLERK', 7902, str_to_date('17-12-1980', '%d-%m-%Y'), 800, null, 20);
insert into EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
values (7499, 'ALLEN', 'SALESMAN', 7698, str_to_date('20-02-1981', '%d-%m-%Y'), 1600, 300, 30);
insert into EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
values (7521, 'WARD', 'SALESMAN', 7698, str_to_date('22-02-1981', '%d-%m-%Y'), 1250, 500, 30);
insert into EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
values (7566, 'JONES', 'MANAGER', 7839, str_to_date('02-04-1981', '%d-%m-%Y'), 2975, null, 20);
insert into EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
values (7654, 'MARTIN', 'SALESMAN', 7698, str_to_date('28-09-1981', '%d-%m-%Y'), 1250, 1400, 30);
insert into EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
values (7698, 'BLAKE', 'MANAGER', 7839, str_to_date('01-05-1981', '%d-%m-%Y'), 2850, null, 30);
insert into EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
values (7782, 'CLARK', 'MANAGER', 7839, str_to_date('09-06-1981', '%d-%m-%Y'), 2450, null, 10);
insert into EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
values (7788, 'SCOTT', 'ANALYST', 7566, str_to_date('19-04-1987', '%d-%m-%Y'), 3000, null, 20);
insert into EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
values (7839, 'KING', 'PRESIDENT', null, str_to_date('17-11-1981', '%d-%m-%Y'), 5000, null, 10);
insert into EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
values (7844, 'TURNER', 'SALESMAN', 7698, str_to_date('08-09-1981', '%d-%m-%Y'), 1500, 0, 30);
insert into EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
values (7876, 'ADAMS', 'CLERK', 7788, str_to_date('23-05-1987', '%d-%m-%Y'), 1100, null, 20);
insert into EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
values (7900, 'JAMES', 'CLERK', 7698, str_to_date('03-12-1981', '%d-%m-%Y'), 950, null, 30);
insert into EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
values (7902, 'FORD', 'ANALYST', 7566, str_to_date('03-12-1981', '%d-%m-%Y'), 3000, null, 20);
insert into EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
values (7934, 'MILLER', 'CLERK', 7782, str_to_date('23-01-1982', '%d-%m-%Y'), 1300, null, 10);


create table salgrade
(
    grade numeric primary key,
    #薪资等级
          losal numeric,
    #最低薪资
          hisal numeric#最高薪资
);

insert into salgrade
values (1, 700, 1200);
#薪资等级为五
insert into salgrade values (2, 1201, 1400);
insert into salgrade
values (3, 1401, 2000);
insert into salgrade
values (4, 2001, 3000);
insert into salgrade
values (5, 3001, 9999);