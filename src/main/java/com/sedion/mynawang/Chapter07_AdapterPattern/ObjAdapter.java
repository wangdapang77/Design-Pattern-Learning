package com.sedion.mynawang.Chapter07_AdapterPattern;

/**
 * 对象适配器（委托）
 * @auther mynawang
 * @create 2017-01-04 14:38
 */
public class ObjAdapter implements Target {

    // 直接关联被适配类
    private Adaptee adaptee;

    public ObjAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void targetMethod1() {
        adaptee.adapteeMethod1();
    }

    @Override
    public void targetMethod2() {
        adaptee.adapteeMethod2();
    }
}
