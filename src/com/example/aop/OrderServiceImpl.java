package com.example.aop;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @autor : WL;
 * @date : 2019/7/3 0003
 */
@Component
public class OrderServiceImpl implements OrderService {
    @Override
    public void add() {
        System.out.println("订单添加");
    }

    @Override
    public void edit() {
        System.out.println("订单修改");
    }

    @Override
    public void delete() {
        System.out.println("订单删除");
    }

    @Override
    public void list() {
        System.out.println("订单查询");
    }
}
