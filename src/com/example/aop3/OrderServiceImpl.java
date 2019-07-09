package com.example.aop3;

import org.springframework.stereotype.Service;

//这个类，就是我要进行增强的类。它在Spring容器中的实例对象，就称为目标对象。
@Service
public class OrderServiceImpl implements OrderService {

	public void add() {
		int a=1/0;
		System.out.println("订单新增");
	}

	@Override
	public void edit() {
		System.out.println("订单修改");
	}

	public void delete() {
//		int  a= 1/0;
//		String str =null;
//		System.out.println(str.length());
		System.out.println("订单删除");
	}

	public void list() {
		System.out.println("订单查询");
	}

	@Override
	public int method(int a, int b) {
		//int ax = 1/0;
		return a+b;
	}

}
