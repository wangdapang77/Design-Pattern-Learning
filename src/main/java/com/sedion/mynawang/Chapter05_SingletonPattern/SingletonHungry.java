package com.sedion.mynawang.Chapter05_SingletonPattern;

/**
 * 单例模式-饿汉式（线程安全、非懒加载）
 * @auther mynawang
 * @create 2016-07-20 14:22
 */
public class SingletonHungry {

    private static final SingletonHungry instance = new SingletonHungry();

    private SingletonHungry(){}

    public static SingletonHungry getInstance() {
        return instance;
    }

}
