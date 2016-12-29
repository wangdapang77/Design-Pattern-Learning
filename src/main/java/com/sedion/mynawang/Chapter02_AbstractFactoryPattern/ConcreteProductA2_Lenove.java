package com.sedion.mynawang.Chapter02_AbstractFactoryPattern;

import java.util.logging.Logger;

/**
 * 产品A 手机类 联想家族 ==> 联想手机
 * @auther mynawang
 * @create 2016-12-29 10:41
 */
public class ConcreteProductA2_Lenove implements ProductA_Phone{

    private Logger logger =  Logger.getLogger("ConcreteProductA2_Lenove_Log");

    public ConcreteProductA2_Lenove() {
        logger.info("抽象工厂 ==> 联想手机被创建ConcreteProductA2_Lenove");
    }
}
