package com.wenzq.remote.api.impl.test;

import com.wenzq.api.test.MyDubboTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author wenzhiqiang
 * @create 2021/5/20 9:10
 */
public class CirculationDependencyTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/spring-application.xml");
        MyDubboTest myTest = context.getBean("myTest", MyDubboTest.class);
        System.out.println(">>> end");
    }

}
