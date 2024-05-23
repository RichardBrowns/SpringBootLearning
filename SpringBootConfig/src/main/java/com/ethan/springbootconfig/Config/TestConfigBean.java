package com.ethan.springbootconfig.Config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "test")
@PropertySource("classpath:test.properties")
@Setter
@Getter
public class TestConfigBean {
    private String name;
    private String age;
}
