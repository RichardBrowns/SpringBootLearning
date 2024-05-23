package com.ethan.springbootaoplog.aop;

import com.ethan.springbootaoplog.annotation.Log;
import com.ethan.springbootaoplog.mapper.SysLogMapper;
import com.ethan.springbootaoplog.entity.SysLog;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.LocalVariableTableParameterNameDiscoverer;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;

@Slf4j
@Aspect
@Component
public class LogAspect {
    @Autowired
    private SysLogMapper sysLogMapper;

    @Pointcut("@annotation(com.ethan.springbootaoplog.annotation.Log)")
    public void pointcut(){}

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        long startTime = System.currentTimeMillis();

        // 获取方法签名和注解信息
        MethodSignature signature = (MethodSignature) point.getSignature();
        Log annotation = signature.getMethod().getAnnotation(Log.class);
        String operationDescription = annotation.value();

        // 执行方法
        Object result = point.proceed();

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        // 记录日志
        log.info("Operation: " + operationDescription + ", Execution Time: " + executionTime + "ms");

        return result;
    }
}
