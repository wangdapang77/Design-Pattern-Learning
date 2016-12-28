package com.sedion.mynawang;

import com.sedion.mynawang.Chapter01_SimpleFactoryPattern.ProductFactory;

import java.text.DateFormat;

/**
 * 简单工厂模式测试
 * @auther mynawang
 * @create 2016-12-28 17:03
 */
public class Chapter01_SimpleFactoryPattern_test {

    public static void main(String[] args) {
        ProductFactory.creatProduct("proA");
        ProductFactory.creatProduct("proB");
        ProductFactory.creatProduct("proC");
        ProductFactory.creatProduct("proD");
    }

}
