package com.sedion.mynawang.Chapter06_PrototypePattern;

/**
 * 具体原型B
 * @auther mynawang
 * @create 2017-01-03 11:39
 */
public class ConcretePrototypeB implements Prototype{

    /**
     * 浅克隆
     * @return
     */
    @Override
    public Prototype clone() {
        Prototype prototype = new ConcretePrototypeB();
        return prototype;
    }
}
