package com.zl.springapi.service;

import com.zl.springapi.service.pojo.People;
import com.zl.springapi.service.utils.SpringContext;

public class test {

    public test(){
        People people = SpringContext.getBean("people", People.class);
        String mobile = people.getMobile();
        System.out.println(mobile);
    }


}
