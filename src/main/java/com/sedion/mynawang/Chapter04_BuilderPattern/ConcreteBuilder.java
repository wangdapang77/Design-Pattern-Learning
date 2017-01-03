package com.sedion.mynawang.Chapter04_BuilderPattern;

import java.util.logging.Logger;

/**
 * 具体的建造者
 * @auther mynawang
 * @create 2017-01-03 10:30
 */
public class ConcreteBuilder implements Builder{

    private Logger logger =  Logger.getLogger("ConcreteBuilder_Log");

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.setPartA("产品部件A被生产");
        logger.info("建造者模式 ==> 产品部件A被生产");
    }

    @Override
    public void buildPartB() {
        product.setPartB("产品部件B被生产");
        logger.info("建造者模式 ==> 产品部件B被生产");
    }

    @Override
    public void buildPartC() {
        product.setPartC("产品部件C被生产");
        logger.info("建造者模式 ==> 产品部件C被生产");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
