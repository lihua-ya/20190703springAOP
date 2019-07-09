package com.example.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Qualifier;

/**
 * @autor : WL;
 * @date : 2019/7/3 0003
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:aop.config.xml")
public class AopTest {


    @Autowired
  //  @Qualifier("enhanceOrderServiceImpl")
    private OrderService orderService;
    @Autowired
    private UserServiceImpl userService;
    @Test
    public void aopTest(){
        orderService = new JDKProxyDemo(orderService).getProxy();
        userService=new CgLibProxyDemo(userService).getProxy();
        orderService.add();
        orderService.delete();
        orderService.edit();
        orderService.list();
        userService.add();
        userService.delete();
        userService.edit();
        userService.list();
    }

}
