package com.sedion.mynawang.Chapter02_AbstractFactoryPattern;

/**
 * 抽象工厂（一组用于创建一族产品的方法，一个方法对应一类产品）
 * @auther mynawang
 * @create 2016-12-29 10:43
 */
public interface Factory {

    ProductA_Phone createProductA();

    ProductB_Computer createProductB();
}
