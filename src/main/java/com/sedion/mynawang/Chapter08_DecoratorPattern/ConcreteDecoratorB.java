package com.sedion.mynawang.Chapter08_DecoratorPattern;

/**
 * 具体装饰类B，是抽象装饰类的子类，负责向构件添加新的职责
 * @auther mynawang
 * @create 2017-01-13 11:09
 */
public class ConcreteDecoratorB extends Decorator{

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    public void operationA() {
        super.operationA();
        // 调用增强业务方法，对原有对象进行装饰、扩展、增强
        operationB();
    }

    public void operationB() {
        System.out.println("ConcreteDecoratorB operationB is used");
    }
}
