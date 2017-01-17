package com.sedion.mynawang;

import com.sedion.mynawang.Chapter09_ProxyPattern.Dynamic_Proxy.CglibProxy;
import com.sedion.mynawang.Chapter09_ProxyPattern.Dynamic_Proxy.CglibRealSubject;
import com.sedion.mynawang.Chapter09_ProxyPattern.Dynamic_Proxy.JdkProxy;
import com.sedion.mynawang.Chapter09_ProxyPattern.Static_Proxy.ProxySubjcet;
import com.sedion.mynawang.Chapter09_ProxyPattern.Static_Proxy.RealSubject;
import com.sedion.mynawang.Chapter09_ProxyPattern.Static_Proxy.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 代理模式测试
 * @auther mynawang
 * @create 2017-01-17 15:06
 */
public class Chapter09_ProxyPattern_test {


    public static void testMethod1() {
        Subject proxySubject = new ProxySubjcet(new RealSubject());
        proxySubject.visit();
    }

    public static void testMethod2() {
        InvocationHandler invocationHandler = new JdkProxy(new RealSubject());

        /**
         * 通过Proxy的newProxyInstance方法来动态创建代理对象
         * 参数1：通过handler类的ClassLoader对象加载代理对象
         * 参数2：获取真实对象上的接口，可以提供调用
         * 参数3：传入关联的对象InvocationHandler
         */
        Subject proxtInstance = (Subject) Proxy.newProxyInstance(invocationHandler.getClass().getClassLoader(),
                RealSubject.class.getInterfaces(), invocationHandler);
        System.out.println(proxtInstance.getClass().getName());
        proxtInstance.visit();
    }


    public static void testMethod3() {
        CglibProxy cglibProxy = new CglibProxy();
        CglibRealSubject cglibRealSubject = (CglibRealSubject) cglibProxy.getProxyInstance(new CglibRealSubject());
        cglibRealSubject.visit();
    }

    public static void main(String[] args) {
        testMethod3();
    }
}
