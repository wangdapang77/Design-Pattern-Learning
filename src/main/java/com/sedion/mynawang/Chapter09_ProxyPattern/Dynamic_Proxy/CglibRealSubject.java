package com.sedion.mynawang.Chapter09_ProxyPattern.Dynamic_Proxy;

/**
 * 普通类
 * @auther mynawang
 * @create 2017-01-17 15:22
 */
public class CglibRealSubject {

    public void visit() {
        System.out.println("CglibRealSubject执行了");
    }
}
