package com.sedion.mynawang.Chapter03_FactoryMethodPattern;

import java.util.logging.Logger;

/**
 * 具体产品A3
 * @auther mynawang
 * @create 2016-12-30 10:16
 */
public class ConcreteProductA3 implements Product{

    private Logger logger =  Logger.getLogger("ConcreteProductA3_Log");

    public ConcreteProductA3() {
        logger.info("工厂方法 ==> 具体产品A3被创建");
    }
}
