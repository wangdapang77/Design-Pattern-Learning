package com.sedion.mynawang.Chapter06_PrototypePattern;

/**
 * 具体原型A
 * @auther mynawang
 * @create 2017-01-03 11:39
 */
public class ConcretePrototypeA implements Prototype{

    /**
     * 浅克隆
     * @return
     */
    @Override
    public Prototype clone() {
        Prototype prototype = new ConcretePrototypeA();
        return prototype;
    }
}
