package com.ethan.springbootaoplog.controller;

import com.ethan.springbootaoplog.annotation.Log;
import com.ethan.springbootaoplog.entity.SysLog;
import com.ethan.springbootaoplog.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SysLogController {

    @Autowired
    private SysLogService sysLogService;

    @Log(value = "查询系统日志")
    @GetMapping("/querySysLog")
    public List<SysLog> querySysLog() {
        return sysLogService.querySysLog();
    }
}
