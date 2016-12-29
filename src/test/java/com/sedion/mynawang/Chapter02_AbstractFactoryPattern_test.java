package com.sedion.mynawang;

import com.sedion.mynawang.Chapter02_AbstractFactoryPattern.*;

/**
 * @auther mynawang
 * @create 2016-12-29 11:02
 */
public class Chapter02_AbstractFactoryPattern_test {

    public static void main(String[] args) {
        Factory factory1 = new Factory1_Apple();
        factory1.createProductA();
        factory1.createProductB();

        Factory factory2 = new Factory2_Lenove();
        factory2.createProductA();
        factory2.createProductB();

        Factory factory3 = new Factory3_Xiaomi();
        factory3.createProductA();
        factory3.createProductB();

    }

}
