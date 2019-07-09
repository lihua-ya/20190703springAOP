package com.example.aop;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * @autor : WL;
 * @date : 2019/7/3 0003
 */
public class CgLibProxyDemo implements MethodInterceptor {
    private UserServiceImpl userService;

    public CgLibProxyDemo(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println(new Date());
        return methodProxy.invokeSuper(o,objects);
    }

    public UserServiceImpl getProxy(){
        //创建cglib的核心对象
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(UserServiceImpl.class);
        //设置拦截回调
        enhancer.setCallback(this);
        //生成代理对象
        return (UserServiceImpl) enhancer.create();
    }
}
