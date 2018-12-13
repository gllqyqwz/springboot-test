package com.wenzq.remote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ServletComponentScan("com.wenzq.remote.config")
@EnableCaching(proxyTargetClass = true)
@ComponentScan(basePackages = {"com.wenzq"})
@ImportResource({"classpath:spring/spring-application.xml"})
public class TestApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

}
