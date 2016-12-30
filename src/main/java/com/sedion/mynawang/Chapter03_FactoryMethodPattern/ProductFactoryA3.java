package com.sedion.mynawang.Chapter03_FactoryMethodPattern;

/**
 * 具体产品A3工厂
 * @auther mynawang
 * @create 2016-12-30 10:33
 */
public class ProductFactoryA3 implements Factory{
    @Override
    public Product createProduct() {
        return new ConcreteProductA3();
    }
}
