package com.sedion.mynawang.Chapter09_ProxyPattern.Static_Proxy;

/**
 * 代理类（ProxySubject只是一个空壳，实际访问的还是RealSubject的visit()方法）
 * @auther mynawang
 * @create 2017-01-17 14:36
 */
public class ProxySubjcet implements Subject {

    private RealSubject realSubject;

    public ProxySubjcet(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void visit() {
        realSubject.visit();
    }
}
