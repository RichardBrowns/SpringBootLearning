package com.ethan.springbootrediscache.mapper;


import com.ethan.springbootrediscache.entity.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface StudentMapper {
    @Insert("insert into student(sno,sname,ssex) values(#{sno},#{sname},#{ssex})")
    int add(Student student);

    @Update("update student set sname=#{sname},ssex=#{ssex} where sno=#{sno}")
    int update(Student student);

    @Delete("delete from student where sno=#{sno}")
    int deleteBySno(String sno);

    @Select("select * from student where sno=#{sno}")
    @Results(id = "student",value = {
            @Result(column = "sno",property = "sno",javaType = String.class),
            @Result(column = "sname",property = "sname",javaType = String.class),
            @Result(column = "ssex",property = "ssex",javaType = String.class)
    })
    Student queryStudentBySno(String sno);
}
