package com.ethan.springbootconfig;

import com.ethan.springbootconfig.Config.TestConfigBean;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(TestConfigBean.class)
@SpringBootApplication
public class SpringBootConfigApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringBootConfigApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

}
