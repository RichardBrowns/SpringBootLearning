package com.ethan.springbootrediscache.controller;

import com.ethan.springbootrediscache.entity.Student;
import com.ethan.springbootrediscache.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    @CachePut(value = "studentCache", key = "#result.sno")
    public int addStudent(@RequestBody Student student){
        return this.studentService.addStudent(student);
    }

    @PutMapping("/updateStudent")
    public int updateStudent(@RequestBody Student student){
        return this.studentService.updateStudent(student);
    }

    @DeleteMapping("/deleteStudent")
    @CacheEvict(value = "studentCache")
    public int deleteStudent(@RequestParam String sno){
        return this.studentService.deleteStudentBysno(sno);
    }

    @GetMapping("/queryStudent")
    @Cacheable(value = "studentCache")
    public Student queryStudentBySno(@RequestParam String sno){
        return this.studentService.queryStudentBySno(sno);
    }
}
