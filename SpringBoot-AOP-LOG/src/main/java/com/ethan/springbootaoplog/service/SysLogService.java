package com.ethan.springbootaoplog.service;


import com.ethan.springbootaoplog.entity.SysLog;

import java.util.List;

public interface SysLogService {
    List<SysLog> querySysLog();
}
