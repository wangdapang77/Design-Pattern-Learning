package com.sedion.mynawang.Chapter03_FactoryMethodPattern;

import java.util.logging.Logger;

/**
 * 具体产品A1
 * @auther mynawang
 * @create 2016-12-30 10:08
 */
public class ConcreteProductA1 implements Product{
    private Logger logger =  Logger.getLogger("ConcreteProductA1_Log");

    public ConcreteProductA1() {
        logger.info("工厂方法 ==> 具体产品A1被创建");
    }
}
