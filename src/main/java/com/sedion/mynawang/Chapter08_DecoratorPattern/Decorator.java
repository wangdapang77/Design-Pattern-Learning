package com.sedion.mynawang.Chapter08_DecoratorPattern;

/**
 * 抽象装饰类
 * @auther mynawang
 * @create 2017-01-13 11:07
 */
public abstract class Decorator implements Component{

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void operationA() {
        // 调用原有业务方法（保持原来的样子）
        component.operationA();
    }
}
