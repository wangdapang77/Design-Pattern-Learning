package com.sedion.mynawang.Chapter02_AbstractFactoryPattern;

import java.util.logging.Logger;

/**
 * 产品B 电脑类 苹果家族 ==> 苹果电脑
 * @auther mynawang
 * @create 2016-12-29 10:42
 */
public class ConcreteProductB1_MacBook implements ProductB_Computer {

    private Logger logger =  Logger.getLogger("ConcreteProductB1_MacBook_Log");

    public ConcreteProductB1_MacBook() {
        logger.info("抽象工厂 ==> 苹果电脑被创建ConcreteProductB1_MacBook");
    }
}
