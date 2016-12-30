package com.sedion.mynawang.Chapter03_FactoryMethodPattern;

/**
 * 具体产品A2工厂
 * @auther mynawang
 * @create 2016-12-30 10:32
 */
public class ProductFactoryA2 implements Factory{
    @Override
    public Product createProduct() {
        return new ConcreteProductA2();
    }
}
