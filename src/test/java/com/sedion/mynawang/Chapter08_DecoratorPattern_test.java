package com.sedion.mynawang;

import com.sedion.mynawang.Chapter08_DecoratorPattern.Component;
import com.sedion.mynawang.Chapter08_DecoratorPattern.ConcreteComponent;
import com.sedion.mynawang.Chapter08_DecoratorPattern.ConcreteDecoratorA;
import com.sedion.mynawang.Chapter08_DecoratorPattern.ConcreteDecoratorB;

/**
 * @auther mynawang
 * @create 2017-01-13 11:22
 */
public class Chapter08_DecoratorPattern_test {


    public static void main(String[] args) {
        Component componentA = new ConcreteDecoratorA(new ConcreteComponent());
        componentA.operationA();

        Component componentB = new ConcreteDecoratorB(new ConcreteComponent());
        componentB.operationA();
    }

}
