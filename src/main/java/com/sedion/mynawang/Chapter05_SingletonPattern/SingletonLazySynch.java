package com.sedion.mynawang.Chapter05_SingletonPattern;

/**
 * 单例模式-懒汉式（线程安全、懒加载）
 * @auther mynawang
 * @create 2016-07-20 13:45
 */
public class SingletonLazySynch {

    private static SingletonLazySynch singletonLazySynch;

    private SingletonLazySynch(){}

    public static synchronized SingletonLazySynch getSingletonLazySynch() {
        if (singletonLazySynch == null) {
            singletonLazySynch = new SingletonLazySynch();
        }
        return singletonLazySynch;
    }

}
