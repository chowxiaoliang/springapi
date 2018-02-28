package com.zl.springapi.service.innerfeatures;

import com.zl.springapi.service.pojo.People;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextAwareTest implements ApplicationContextAware {

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("初始化实现了ApplicationContextAware的类");
        People people = applicationContext.getBean("people", People.class);
        System.out.println("在ApplicationContextAwareTest里面输出=>"+people.getName());
    }
}
