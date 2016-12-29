package com.sedion.mynawang.Chapter02_AbstractFactoryPattern;

/**
 * 具体工厂（苹果公司工厂，用于生产苹果家族的产品）
 * @auther mynawang
 * @create 2016-12-29 10:43
 */
public class Factory1_Apple implements Factory{


    @Override
    public ProductA_Phone createProductA() {
        return new ConcreteProductA1_Iphone();
    }

    @Override
    public ProductB_Computer createProductB() {
        return new ConcreteProductB1_MacBook();
    }
}
