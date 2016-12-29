package com.sedion.mynawang.Chapter02_AbstractFactoryPattern;

import java.util.logging.Logger;

/**
 * 产品A 手机类 苹果家族 ==> 苹果手机
 * @auther mynawang
 * @create 2016-12-29 10:41
 */
public class ConcreteProductA1_Iphone implements ProductA_Phone{

    private Logger logger =  Logger.getLogger("ConcreteProductA1_Iphone_Log");

    public ConcreteProductA1_Iphone() {
        logger.info("抽象工厂 ==> 苹果手机被创建ConcreteProductA1_Iphone");
    }
}
