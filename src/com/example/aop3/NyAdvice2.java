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
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//注解驱动的通知类的写法
//1. 需要在这个类上标记一个注解：@Aspect ,说明，将来这将会生成一个切面。
@Aspect
@Component
@Order(0)
public class NyAdvice2 /*implements Ordered*/{
	//比如：以前的前置通知的定义
	//value 就是切点表达式
	@Before(value="execution(* com.example.aop.annotation.*.edit(..))")
	public void method() {
		System.out.println("哈哈哈哈哈");
	}

	public int getOrder() {
		return 0;
	}

}
