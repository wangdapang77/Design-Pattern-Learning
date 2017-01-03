package com.sedion.mynawang;

import com.sedion.mynawang.Chapter03_FactoryMethodPattern.*;

/**
 * 工厂方法测试
 * @auther mynawang
 * @create 2016-12-30 10:35
 */
public class Chapter03_FactoryMethodPattern_test {

    public static void main(String[] args) {
        Factory factory = null;

        factory = new ProductFactoryA1();
        Product productA1 = factory.createProduct();

        factory = new ProductFactoryA2();
        Product productA2 = factory.createProduct();

        factory = new ProductFactoryA3();
        Product productA3 = factory.createProduct();

    }

}
