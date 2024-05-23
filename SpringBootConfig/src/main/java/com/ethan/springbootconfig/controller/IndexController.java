package com.ethan.springbootconfig.controller;

import com.ethan.springbootconfig.Config.BlogProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    private BlogProperties blogProperties;

    @RequestMapping("/")
    public String index(){
        return "name: "+blogProperties.getName()+" title: "+blogProperties.getTitle();
    }
}
