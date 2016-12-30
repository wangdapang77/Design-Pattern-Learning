package com.sedion.mynawang.Chapter03_FactoryMethodPattern;

import java.util.logging.Logger;

/**
 * 具体产品A2
 * @auther mynawang
 * @create 2016-12-30 10:08
 */
public class ConcreteProductA2 implements Product{

    private Logger logger =  Logger.getLogger("ConcreteProductA2_Log");

    public ConcreteProductA2() {
        logger.info("工厂方法 ==> 具体产品A2被创建");
    }


}
