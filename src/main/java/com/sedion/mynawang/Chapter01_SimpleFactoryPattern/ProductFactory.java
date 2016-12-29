package com.sedion.mynawang.Chapter01_SimpleFactoryPattern;


import java.util.logging.Logger;

/**
 * 工厂类，用来生产产品（简单工厂类||静态工厂类）
 * @auther mynawang
 * @create 2016-12-28 17:04
 */
public class ProductFactory {

    private static Logger logger = Logger.getLogger("ProductFactory_log");

    public static Product creatProduct(String productType) {
        Product product = null;
        if ("proA".equals(productType)) {
            product = new ProductA();
            logger.info("简单工厂==> 创建了ProductA");
        } else if ("proB".equals(productType)) {
            product = new ProductB();
            logger.info("简单工厂=> 创建了ProductB");
        } else if ("proC".equals(productType)) {
            product = new ProductC();
            logger.info("简单工厂==> 创建了ProductC");
        } else {
            logger.info("简单工厂==> 没有这样的产品");
        }
        return product;
    }

}
