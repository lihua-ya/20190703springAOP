package com.example.aop;

import org.springframework.stereotype.Component;

/**
 * @autor : WL;
 * @date : 2019/7/3 0003
 */
@Component
public class UserServiceImpl implements UserService {

    public void add() {
        System.out.println("用户添加");
    }


    public void edit() {
        System.out.println("用户修改");
    }


    public void delete() {
        System.out.println("用户删除");
    }


    public void list() {
        System.out.println("用户查询");
    }
}
