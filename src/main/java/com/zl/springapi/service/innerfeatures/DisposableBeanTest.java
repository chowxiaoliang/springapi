package com.zl.springapi.service.innerfeatures;

import org.springframework.beans.factory.DisposableBean;

public class DisposableBeanTest implements DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("初始化实现了DisposableBean方法的类");
    }
}
