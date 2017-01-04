package com.sedion.mynawang.Chapter07_AdapterPattern;

import java.util.logging.Logger;

/**
 * 目标接口实现
 * @auther mynawang
 * @create 2017-01-04 15:48
 */
public class ConcreteTarget implements Target{

    private Logger logger =  Logger.getLogger("ConcreteTarget_Log");

    @Override
    public void targetMethod1() {
        logger.info("适配器模式 ==> targetMethod1被调用");
    }

    @Override
    public void targetMethod2() {
        logger.info("适配器模式 ==> targetMethod2被调用");
    }
}
