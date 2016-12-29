package com.sedion.mynawang.Chapter02_AbstractFactoryPattern;

import java.util.logging.Logger;

/**
 * 产品B 电脑类 联想家族 ==> 联想电脑
 * @auther mynawang
 * @create 2016-12-29 10:42
 */
public class ConcreteProductB2_ThinkPad implements ProductB_Computer {

    private Logger logger =  Logger.getLogger("ConcreteProductB2_ThinkPad_Log");

    public ConcreteProductB2_ThinkPad() {
        logger.info("抽象工厂 ==> 联想电脑ThinkPad被创建ConcreteProductB2_ThinkPad");
    }
}
