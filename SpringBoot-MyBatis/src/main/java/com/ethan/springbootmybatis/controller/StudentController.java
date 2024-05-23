package com.ethan.springbootmybatis.controller;

import com.ethan.springbootmybatis.entity.Student;
import com.ethan.springbootmybatis.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/queryStudent")
    public Student queryStudentBySno(@RequestParam String sno){
        return this.studentService.queryStudentBySno(sno);
    }
}
