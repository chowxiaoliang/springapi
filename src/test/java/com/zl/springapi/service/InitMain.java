package com.zl.springapi.service;

import com.zl.springapi.service.pojo.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;

public class InitMain {

    @Test
    public void test1() throws Exception{
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        new CountDownLatch(1).await();
        System.in.read();
        Hello hello = applicationContext.getBean("hello", Hello.class);
        hello.sayHello();

    }



}
