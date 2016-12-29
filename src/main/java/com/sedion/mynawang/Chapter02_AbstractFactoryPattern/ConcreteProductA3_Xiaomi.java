package com.sedion.mynawang.Chapter02_AbstractFactoryPattern;

import java.util.logging.Logger;

/**
 * 产品A 手机类 小米家族 ==> 小米手机
 * @auther mynawang
 * @create 2016-12-29 10:41
 */
public class ConcreteProductA3_Xiaomi implements ProductA_Phone{

    private Logger logger =  Logger.getLogger("ConcreteProductA3_Xiaomi_Log");

    public ConcreteProductA3_Xiaomi() {
        logger.info("抽象工厂 ==> 小米手机被创建ConcreteProductA3_Xiaomi");
    }
}
