package com.sedion.mynawang.Chapter09_ProxyPattern.Dynamic_Proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 对没有实现接口的普通类做代理
 * @auther mynawang
 * @create 2017-01-17 15:16
 */
public class CglibProxy implements MethodInterceptor {

    private Object target;

    public Object getProxyInstance(Object target) {
        this.target = target;
        // 声明增强实例
        Enhancer enhancer = new Enhancer();
        // 设置被代理类字节码，CGLIB根据字节码生成被代理类的子类
        enhancer.setSuperclass(this.target.getClass());
        // 设置要代理的拦截器，回调函数，即一个拦截方法 new MethodInterceptor()
        enhancer.setCallback(this);
        // 创建代理对象 实例
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理真实对象前执行操作");

        methodProxy.invokeSuper(o, objects);

        System.out.println("代理真实对象后执行操作");

        return null;
    }
}
