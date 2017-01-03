package com.sedion.mynawang.Chapter04_BuilderPattern;

import java.util.logging.Logger;

/**
 * 指挥者
 * @auther mynawang
 * @create 2017-01-03 10:34
 */
public class Director {
    private Logger logger =  Logger.getLogger("Director_Log");

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product construct() {
        logger.info("建造者模式 ==> 指挥者建造产品开始");
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        logger.info("建造者模式 ==> 指挥者建造产品结束");
        return builder.getProduct();
    }
}
