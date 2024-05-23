package com.ethan.springbootaoplog.service.impl;

import com.ethan.springbootaoplog.entity.SysLog;
import com.ethan.springbootaoplog.mapper.SysLogMapper;
import com.ethan.springbootaoplog.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class SysLogServiceImpl implements SysLogService {

    @Autowired
    private SysLogMapper mapper;
    @Override
    public List<SysLog> querySysLog() {
        return this.mapper.querySysLog();
    }
}
