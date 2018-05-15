package com.zl.springapi.service.innerfeatures;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextAwareTest implements ApplicationContextAware {
    public ApplicationContextAwareTest(){
        System.out.println("ApplicationContextAwareTest constructor is executing");
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("初始化实现了ApplicationContextAware的类");
    }
}
