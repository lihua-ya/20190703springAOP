package com.example.aop1;

/**
 * @autor : WL;
 * @date : 2019/7/3 0003
 */
public interface OrderService {
        void add();
        void edit();
        void delete();
        void list();

        void method1(int a);
        void method2(int a);
        void method3(int a,int b);
}
