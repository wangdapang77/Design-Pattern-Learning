package com.sedion.mynawang.Chapter07_AdapterPattern;

/**
 * 类适配器（继承父类特性）
 * @auther mynawang
 * @create 2017-01-04 13:57
 */
public class ClassAdapter extends Adaptee implements Target{
    @Override
    public void targetMethod1() {
        super.adapteeMethod1();
    }

    @Override
    public void targetMethod2() {

    }
}
