package com.sedion.mynawang.Chapter04_BuilderPattern;

/**
 * 建造者接口（抽象建造者）
 * @auther mynawang
 * @create 2016-12-31 16:06
 */
public interface Builder {

    void buildPartA();

    void buildPartB();

    void buildPartC();

    Product getProduct();

}
