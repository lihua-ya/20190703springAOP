package com.example.aop1;

import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;
import java.util.Date;

/**
 * @autor : WL;
 * @date : 2019/7/3 0003
 */
//作为自定义的通知类。它内部包含了要进行增强的逻辑。

//面上看：1. 它只是一个普通的Java类 2.它只包含了普通的方法。
public class MyAdvice {

    public void test(Auditable b){
        System.out.println("hello world"+b.value());
    }

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

    //环绕通知定义：必须以参数类型： org.aspectj.lang.ProceedingJoinPoint
    public void around(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println(Arrays.asList(proceedingJoinPoint.getArgs()));//拿到的就是调用目标方法时，传递的参数信息
        System.out.println(proceedingJoinPoint.getSignature());//目标方法的签名
        System.out.println(proceedingJoinPoint.getTarget());//目标对象
        System.out.println(proceedingJoinPoint.getThis());//自动生成的代理对象
//		proceedingJoinPoint.proceed();
        try {
            proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs());
//			return Integer.valueOf(proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs()).toString())*10;
        } catch (Throwable e) {
            e.printStackTrace();
        }  //调用目标方法
//		return null;
    }
}
