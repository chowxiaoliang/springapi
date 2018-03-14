package com.zl.springapi.service.innerfeatures;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * Created by Administrator on 2018/3/11 0011.
 */
public class BeanNameFactoryTest implements BeanFactoryAware{
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("实现了BeanFactoryAware的bean调用setBeanFacory方法");
    }
}
