package com.sedion.mynawang.Chapter02_AbstractFactoryPattern;

/**
 * 具体工厂（联想公司工厂，用于生产联想家族的产品）
 * @auther mynawang
 * @create 2016-12-29 10:44
 */
public class Factory2_Lenove implements Factory {
    @Override
    public ProductA_Phone createProductA() {
        return new ConcreteProductA2_Lenove();
    }

    @Override
    public ProductB_Computer createProductB() {
        return new ConcreteProductB2_ThinkPad();
    }
}
