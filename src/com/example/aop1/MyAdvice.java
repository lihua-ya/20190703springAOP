package com.example.aop1;

import java.util.Date;

/**
 * @autor : WL;
 * @date : 2019/7/3 0003
 */
//作为自定义的通知类。它内部包含了要进行增强的逻辑。

//面上看：1. 它只是一个普通的Java类 2.它只包含了普通的方法。
public class MyAdvice {

    public void someMethod(){ //准备执行的逻辑
        System.out.println(new Date());
    }

    public void getParm(int a){
        //增强逻辑，如果调用的参数小于50，什么都不做，否则记录日志
        if(a>=50){
            System.out.println("getParm:"+a);
        }

    }

    public void getParm1(int a,int b){
        int c=a+b;
        System.out.println("getParm:"+c);
    }

    public void exception(Exception e) { //准备执行的逻辑
        System.out.println(e);//想知道目标方法（切点对应的方法）执行时抛出的那个异常对象。
    }
}
