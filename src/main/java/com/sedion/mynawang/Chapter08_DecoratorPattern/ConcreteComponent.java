package com.sedion.mynawang.Chapter08_DecoratorPattern;

/**
 * 具体构件（继承、实现 抽象构件），也就是被装饰对象
 * @auther mynawang
 * @create 2017-01-13 11:06
 */
public class ConcreteComponent implements Component{
    @Override
    public void operationA() {
        System.out.println("ConcreteComponent operationA is used");
    }
}
