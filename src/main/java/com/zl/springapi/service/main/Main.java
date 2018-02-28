package com.zl.springapi.service.main;

import com.zl.springapi.service.pojo.Company;
import com.zl.springapi.service.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){

        ApplicationContext act = new ClassPathXmlApplicationContext("application.xml");

        People people = act.getBean("people", People.class);

        Company company = act.getBean("company", Company.class);

        System.out.println(people.getAge());
        System.out.println(people.getMobile());

        System.out`

    }
}
