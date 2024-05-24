package com.ethan.springbootrediscache.service;


import com.ethan.springbootrediscache.entity.Student;

public interface StudentService {
    int addStudent(Student student);
    int updateStudent(Student student);
    int deleteStudentBysno(String sno);
    Student queryStudentBySno(String sno);
}
