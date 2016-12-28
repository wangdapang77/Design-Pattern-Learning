package com.sedion.mynawang.Chapter05_SingletonPattern;

/**
 * 单例模式-登记式（线程安全、懒加载）
 * @auther mynawang
 * @create 2016-07-20 14:59
 */
public class SingletonRegistration {

    private static class SingletonHolder {
        private static final SingletonRegistration INSTANCE = new SingletonRegistration();
    }

    private SingletonRegistration(){}

    public static SingletonRegistration getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
