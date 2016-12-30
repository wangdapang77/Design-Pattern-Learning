package com.sedion.mynawang.Chapter03_FactoryMethodPattern;

/**
 * 具体产品A1工厂
 * @auther mynawang
 * @create 2016-12-30 10:31
 */
public class ProductFactoryA1 implements Factory{
    @Override
    public Product createProduct() {
        return new ConcreteProductA1();
    }
}
