package com.sedion.mynawang;


import com.sedion.mynawang.Chapter05_SingletonPattern.*;

/**
 * @auther mynawang
 * @create 2016-12-28 14:23
 */
public class Chapter05_SingletonPattern_test {

    /**
     * 双重校验锁测试（线程安全、懒加载、JDK1.5以后）
     */
    public void testDoubleChecked() {
        SingletonDoubleChecked singletonDoubleChecked1 = SingletonDoubleChecked.getInstance();
        SingletonDoubleChecked singletonDoubleChecked2 = SingletonDoubleChecked.getInstance();
        System.out.println(singletonDoubleChecked1 == singletonDoubleChecked2);
    }

    /**
     * 枚举测试（线程安全、懒加载、JDK1.5之后）
     */
    public void testEnum() {
        SingletonEnum singletonEnum1 = SingletonEnum.INSTANCE;
        SingletonEnum singletonEnum2 = SingletonEnum.INSTANCE;
        System.out.println(singletonEnum1 == singletonEnum2);
    }

    /**
     * 饿汉式测试（线程安全、非懒加载）
     */
    public void testHungry() {
        SingletonHungry singletonHungry1 = SingletonHungry.getInstance();
        SingletonHungry singletonHungry2 = SingletonHungry.getInstance();
        System.out.println(singletonHungry1 == singletonHungry2);
    }


    /**
     * 懒汉式（线程不安全、懒加载）
     */
    public void testLazy(){
        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();
        System.out.println(singletonLazy1 == singletonLazy2);
    }

    /**
     * 懒汉式加同步锁测试（线程安全、懒加载）
     */
    public void testLazySynch() {
        SingletonLazySynch singletonLazySynch1 = SingletonLazySynch.getSingletonLazySynch();
        SingletonLazySynch singletonLazySynch2 = SingletonLazySynch.getSingletonLazySynch();
        System.out.println(singletonLazySynch1 == singletonLazySynch2);
    }

    /**
     * 登记式测试（线程安全、懒加载）
     */
    public void testReg() {
        SingletonRegistration singletonRegistration1 = SingletonRegistration.getInstance();
        SingletonRegistration singletonRegistration2 = SingletonRegistration.getInstance();
        System.out.println(singletonRegistration1 == singletonRegistration2);
    }



    public static void main(String[] args) throws Exception {
        while (true) {
            Chapter05_SingletonPattern_test chapter05_singletonPattern_test = new Chapter05_SingletonPattern_test();
            chapter05_singletonPattern_test.testReg();
        }
    }

}
