package com.ethan.springbootaoplog.entity;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class SysLog implements Serializable {

    private static final long serialVersionUID = -6309732882044872298L;

    private Integer id;
    private String username;
    private String operation;
    private Integer time;
    private String method;
    private String params;
    private String ip;
    private Date createTime;
}