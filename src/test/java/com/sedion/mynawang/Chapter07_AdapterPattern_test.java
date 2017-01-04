package com.sedion.mynawang;

import com.sedion.mynawang.Chapter07_AdapterPattern.*;

/**
 * 适配器模式测试
 * @auther mynawang
 * @create 2017-01-04 16:16
 */
public class Chapter07_AdapterPattern_test {

    /**
     * client使用目标接口Target
     * (client类比为人)
     * (Target类比为笔记本电脑【需要36v电压】)
     * (Adaptee类比为三孔插座【输出220v电压】)
     * (Adapter类比为充电器，将Adaptee和Target进行适配，供client的人使用)
     */
    private static void AdapterPattern_test1() {
        Target target1 = new ConcreteTarget();
        target1.targetMethod1();

        Adaptee adaptee = new Adaptee();
        Target target2 = new ObjAdapter(adaptee);
        target2.targetMethod1();

        Target target3 = new ClassAdapter();
        target3.targetMethod1();
    }


    public static void main(String[] args) {
        AdapterPattern_test1();
    }

}
