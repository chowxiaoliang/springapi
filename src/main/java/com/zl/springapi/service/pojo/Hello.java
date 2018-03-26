package com.zl.springapi.service.pojo;

public class Hello {

    private String resultStr;

    public String getResultStr() {
        return resultStr;
    }

    public void setResultStr(String resultStr) {
        this.resultStr = resultStr;
    }

    public Hello(){
        System.out.println("执行Hello不含参数的构造函数");
    }
    public Hello(String resultStr){
        this.resultStr = resultStr;
        System.out.println("执行Hello含有参数的构造函数=>"+resultStr);
    }
    public void sayHello(){
        System.out.println("say hello=>"+resultStr);
    }
    public void initMethod(){
        System.out.println("init method is executing...");
    }
    public void destroyMethod(){
        System.out.println("destory method is executing...");
    }
}
