package com.ethan.springbootrediscache.service.impl;


import com.ethan.springbootrediscache.entity.Student;
import com.ethan.springbootrediscache.mapper.StudentMapper;
import com.ethan.springbootrediscache.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int addStudent(Student student) {
        return this.studentMapper.add(student);
    }

    @Override
    public int updateStudent(Student student) {
        return this.studentMapper.update(student);
    }

    @Override
    public int deleteStudentBysno(String sno) {
        return this.studentMapper.deleteBySno(sno);
    }

    @Override
    public Student queryStudentBySno(String sno) {
        return this.studentMapper.queryStudentBySno(sno);
    }
}
