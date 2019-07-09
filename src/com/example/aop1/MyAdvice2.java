package com.example.aop1;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import java.util.Date;

/**
 * @autor : WL;
 * @date : 2019/7/9 0009
 */
public class MyAdvice2 implements Ordered {
    public void someMethod() { //准备执行的逻辑
        System.out.println(new Date());
    }
    public int getOrder() {
        return 40;
    }
}
