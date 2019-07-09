package com.example.aop;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @autor : WL;
 * @date : 2019/7/3 0003
 */
//@Component
public class EnhanceOrderServiceImpl implements OrderService {

    private OrderService orderService;

    public EnhanceOrderServiceImpl(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void add() {
        System.out.println(new Date());
        orderService.add();
    }

    @Override
    public void edit() {
        orderService.edit();
    }

    @Override
    public void delete() {
        orderService.delete();
    }

    @Override
    public void list() {
        orderService.list();
    }
}
