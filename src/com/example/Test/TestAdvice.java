package com.example.Test;

import com.example.aop1.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @autor : WL;
 * @date : 2019/7/8 0008
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ="classpath:spring01.xml")
public class TestAdvice {
    @Resource
    private OrderService orderService;

    @Test
    public void test01(){
        orderService.add();
        orderService.delete();
        orderService.edit();
        orderService.list();
        orderService.method1(49);
        orderService.method2(50);
        orderService.method3(10,15);

    }

}

