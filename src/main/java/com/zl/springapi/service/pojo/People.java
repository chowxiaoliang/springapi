package com.zl.springapi.service.pojo;

import org.springframework.stereotype.Component;

@Component
public class People {

    private String certNo;

    private String mobile;

    private String name;

    private String sex;

    private int age;

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public People(){
        System.out.println("初始化people的构造函数");
        this.age = 21;
        this.certNo = "12345678945613";
        this.mobile = "15872151893";
        this.sex = "male";
    }

    static {
        System.out.println("执行people里面的静态代码块");
    }

}
