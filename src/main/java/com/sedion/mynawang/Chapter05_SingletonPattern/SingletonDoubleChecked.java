package com.sedion.mynawang.Chapter05_SingletonPattern;

/**
 * 单例模式-双重校验锁（double-checked locking）（线程安全、懒加载、JDK1.5以后）
 * @auther mynawang
 * @create 2016-07-20 14:28
 */
public class SingletonDoubleChecked {
    private volatile static SingletonDoubleChecked instance;

    private SingletonDoubleChecked() {}

    public static SingletonDoubleChecked getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleChecked.class) {
                if (instance == null) {

                    instance = new SingletonDoubleChecked();
                }
            }
        }
        return instance;
    }
}
