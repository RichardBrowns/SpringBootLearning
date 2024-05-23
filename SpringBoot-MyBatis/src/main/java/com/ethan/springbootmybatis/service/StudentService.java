package com.ethan.springbootmybatis.service;


import com.ethan.springbootmybatis.entity.Student;

public interface StudentService {
    int add(Student student);
    int update(Student student);
    int deleteBysno(String sno);
    Student queryStudentBySno(String sno);
}
