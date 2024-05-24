package com.ethan.springbootrediscache.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class Student implements Serializable {

    private String sno;
    private String sname;
    private String ssex;
}
