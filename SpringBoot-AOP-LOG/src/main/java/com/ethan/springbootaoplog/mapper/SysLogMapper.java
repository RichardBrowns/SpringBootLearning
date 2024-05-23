package com.ethan.springbootaoplog.mapper;


import com.ethan.springbootaoplog.entity.SysLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface SysLogMapper {
    @Select("select * from sys_log")
    List<SysLog> querySysLog();
}
