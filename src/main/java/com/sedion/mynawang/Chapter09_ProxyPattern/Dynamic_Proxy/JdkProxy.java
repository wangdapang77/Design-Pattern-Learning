package com.sedion.mynawang.Chapter09_ProxyPattern.Dynamic_Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * JDK动态代理类，类实现接口
 * @auther mynawang
 * @create 2017-01-17 15:04
 */
public class JdkProxy implements InvocationHandler{


    private Object subject;

    public JdkProxy(Object subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("代理真实对象前执行操作");

        method.invoke(subject, args);

        System.out.println("代理真实对象后执行操作");

        return null;
    }
}
