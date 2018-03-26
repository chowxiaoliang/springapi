package com.zl.springapi.service.innerfeatures;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by Administrator on 2018/3/11 0011.
 */
public class BeanPostProcessorTest implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("实现了BeanPostProcessor的bean调用postProcessBeforeInitialization方法");
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("实现了BeanPostProcessor的bean调用postProcessAfterInitailization方法");
        return null;
    }
}
