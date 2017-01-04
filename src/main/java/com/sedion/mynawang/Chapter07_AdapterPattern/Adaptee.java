package com.sedion.mynawang.Chapter07_AdapterPattern;

import java.util.logging.Logger;

/**
 * 被适配类
 * @auther mynawang
 * @create 2017-01-04 11:51
 */
public class Adaptee {

    private Logger logger =  Logger.getLogger("Adaptee_Log");

    public void adapteeMethod1() {
        logger.info("适配器模式 ==> adapteeMethod1被调用");
    }

    public void adapteeMethod2() {
        logger.info("适配器模式 ==> adapteeMethod2被调用");
    }

}
