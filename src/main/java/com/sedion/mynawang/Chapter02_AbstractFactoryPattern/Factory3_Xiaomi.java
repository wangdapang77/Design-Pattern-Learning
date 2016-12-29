package com.sedion.mynawang.Chapter02_AbstractFactoryPattern;

/**
 * 具体工厂（小米公司工厂，用于生产小米家族的产品）
 * @auther mynawang
 * @create 2016-12-29 10:44
 */
public class Factory3_Xiaomi implements Factory {
    @Override
    public ProductA_Phone createProductA() {
        return new ConcreteProductA3_Xiaomi();
    }

    @Override
    public ProductB_Computer createProductB() {
        return new ConcreteProductB3_XiaomiAir();
    }
}
