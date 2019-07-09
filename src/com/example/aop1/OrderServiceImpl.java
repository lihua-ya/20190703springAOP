package com.example.aop1;

import com.example.aop1.OrderService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @autor : WL;
 * @date : 2019/7/3 0003
 */
//这个类，就是要进行增强的类。它在Spring容器中的对象，就称为目标对象。
@Service
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

    @Override
    public void method1(int a){
        System.out.println(a);
    }

    @Override
    public void method2(int a){
        System.out.println(a);
    }

    @Override
    public void method3(int a, int b) {
        System.out.println(a+b);
    }
}
