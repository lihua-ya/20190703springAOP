package com.example.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

/**
 * @autor : WL;
 * @date : 2019/7/3 0003
 */
public class JDKProxyDemo implements InvocationHandler {
    private OrderService orderService;

    public JDKProxyDemo(OrderService orderService){
        this.orderService=orderService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //proxy 对象，就是java对象生成的那个代理类所产生出来的对象。
        //method参数，被带离对象的方法。
        //args参数，就是调用该方法时传递的参数。

        //这个method方法要想被执行，必须得到被代理对象，才可以执行。所以被代理的对象，旺旺同难过构造方法的形式传递进来。
        //如果我要对你的目标方法进行增强
        //可以根据方法名灯进行针对性的增强
        System.out.println(new Date());//前置通知

        try {
            Object result = method.invoke(orderService, args);
            System.out.println(new Date());//后置通知
            return result;
        }catch(Exception e){
            //捕获到异常
            System.out.println("记录到日志:"+e.getMessage());//异常通知
        }finally {
            System.out.println(new Date());//最终通知

        }

        return proxy;
    }

    //如何获取到动态产生的这个代理对象本身

    public OrderService getProxy() {
        //Proxy.newProxyInstance 方法动态产生一个代理对象
        //参数1：ClassLoader 类加载器，一般选择跟被代理类的就行
        //参数2：Class<?>[] 被代理的接口
        //参数3：指定被代理对象的方法调用拦截器
        return (OrderService)Proxy.newProxyInstance(orderService.getClass().getClassLoader(),new Class[]{OrderService.class},this);
    }

}
