package com.sedion.mynawang.Chapter02_AbstractFactoryPattern;

import java.util.logging.Logger;

/**
 * 产品B 电脑类 小米家族 ==> 小米电脑
 * @auther mynawang
 * @create 2016-12-29 10:42
 */
public class ConcreteProductB3_XiaomiAir implements ProductB_Computer {

    private Logger logger =  Logger.getLogger("ConcreteProductB3_XiaomiAir_Log");

    public ConcreteProductB3_XiaomiAir() {
        logger.info("抽象工厂 ==> 小米笔记本Air被创建ConcreteProductB3_XiaomiAir");
    }

}
