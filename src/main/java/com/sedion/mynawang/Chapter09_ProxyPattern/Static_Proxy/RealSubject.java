package com.sedion.mynawang.Chapter09_ProxyPattern.Static_Proxy;

/**
 * 真实访问类（真实访问对象/委托对象）
 * @auther mynawang
 * @create 2017-01-17 14:30
 */
public class RealSubject implements Subject{

    @Override
    public void visit() {
        System.out.println("RealSubject执行了");
    }

}
