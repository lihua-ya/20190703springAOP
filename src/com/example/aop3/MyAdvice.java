package com.example.aop3;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//注解驱动的通知类的写法
//1. 需要在这个类上标记一个注解：@Aspect ,说明，将来这将会生成一个切面。
@Aspect
@Component
public class MyAdvice {
	//比如：以前的前置通知的定义
	//value 就是切点表达式
//	@Before(value="execution(* com.example.aop.*.*(..))")
//	public void method() {
//		System.out.println("哈哈哈哈哈");
//	}
//	
//	@AfterReturning(value="execution(* com.example.aop.*.*(..))")
//	public void method2() {
//		System.out.println("嘻嘻嘻嘻嘻");
//	}
//	
//	@AfterThrowing(value="execution(* com.example.aop.*.*(..))")
//	public void method3() {
//		System.out.println("呃呃呃呃呃呃");
//	}
//	
//	@After(value="execution(* com.example.aop.*.*(..))")
//	public void method4() {
//		System.out.println("嘤嘤嘤嘤嘤嘤");
//	}
	
//	@Around(value="execution(* com.example.aop.*.*(..))")
//	public void method5(ProceedingJoinPoint joinPoint) {
//		try{
//            try{
//            	System.out.println("哈哈哈哈哈");;//对应@Before注解的方法切面逻辑
//            	joinPoint.proceed(joinPoint.getArgs());//执行目标方法
//            }finally{
//            	System.out.println("嘤嘤嘤嘤嘤嘤");//对应@After注解的方法切面逻辑
//            }
//            System.out.println("嘻嘻嘻嘻嘻");//对应@AfterReturning注解的方法切面逻辑
//        }catch(Throwable e){
//        	System.out.println("呃呃呃呃呃呃");//对应@AfterThrowing注解的方法切面逻辑
//        }
//	}
	
	//测试参数的传递
//	@Before(value="execution(* com.example.aop.annotation.*.*(..)) && args(ab,cd)",argNames= "ab,cd")
//	public void method1(int aaa,int bbb) {
//		System.out.println("执行参数："+aaa+"   "+bbb);
//	}
//	
//	@Before(value="execution(* com.example.aop.annotation.*.*(..))")
//	public void method1(JoinPoint joinPoint) {
//		System.out.println("执行参数："+Arrays.asList(joinPoint.getArgs()));
//	}
//	
//	@AfterReturning(value="execution(* com.example.aop.annotation.*.*(..))",returning="x")
//	public void returning(int x){
//		System.out.println(x);
//	}
//	
//	@AfterThrowing(value="execution(* com.example.aop.annotation.*.*(..))",throwing="ex")
//	public void returning(Exception ex){
//		System.out.println(ex.getMessage());
//	}
	
//	//演示：抽取公共的切点表达式。核心思想，是写任意一个方法，标记@Pointcut注解
//	@Pointcut(value="execution(* com.example.aop.annotation.*.*(..)) && args(a,b)")
//	public void jionPoint(int a,int b) {
//		
//	}
//	@Before(value="jionPoint(aaa,bbb)")
//	public void methodBefore(JoinPoint joinPoint,int aaa,int bbb) {
//		System.out.println("执行参数："+aaa+"   "+bbb);
//		System.out.println("执行参数："+Arrays.asList(joinPoint.getArgs()));
//		System.out.println("哈哈哈哈哈");
//	}
//	@AfterThrowing(value="jionPoint(a,b)",throwing="ex")
//	public void afterThrowing(int a,int b,Exception ex) {
//		System.out.println(ex);
//	}
//	
//	@AfterReturning(value="jionPoint(a,b)",returning="ex")
//	public void afterReturning(int a,int b,int ex) {
//		System.out.println(ex);
//	}
}
