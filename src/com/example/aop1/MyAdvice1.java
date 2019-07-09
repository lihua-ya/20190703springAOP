package com.example.aop1;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @autor : WL;
 * @date : 2019/7/9 0009
 */

public class MyAdvice1 implements Ordered {
    public void someMethod() { //准备执行的逻辑
        System.out.println("你好");
    }
    public int getOrder() {
        return 1;
    }
}
