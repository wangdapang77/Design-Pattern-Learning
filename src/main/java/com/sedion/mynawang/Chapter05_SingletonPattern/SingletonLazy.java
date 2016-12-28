package com.sedion.mynawang.Chapter05_SingletonPattern;

/**
 * 单例模式-懒汉式（线程不安全、懒加载）
 * @auther mynawang
 * @create 2016-07-20 11:48
 */
public class SingletonLazy {

    private static SingletonLazy instance;

    // 防止多次实例化
    private SingletonLazy(){}

    // 提供调用创建实例
    public static SingletonLazy getInstance(){
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }


}
