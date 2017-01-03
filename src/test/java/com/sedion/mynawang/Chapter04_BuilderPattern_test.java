package com.sedion.mynawang;

import com.sedion.mynawang.Chapter04_BuilderPattern.ConcreteBuilder;
import com.sedion.mynawang.Chapter04_BuilderPattern.Director;

/**
 * 建造者模式测试
 * @auther mynawang
 * @create 2017-01-03 10:43
 */
public class Chapter04_BuilderPattern_test {

    public static void main(String[] args) {
        ConcreteBuilder concreteBuilder = new ConcreteBuilder();
        Director director = new Director(concreteBuilder);
        director.construct();
    }

}
