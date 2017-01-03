package com.sedion.mynawang;

import com.sedion.mynawang.Chapter06_PrototypePattern.ConcretePrototypeA;
import com.sedion.mynawang.Chapter06_PrototypePattern.Prototype;
import com.sedion.mynawang.Chapter06_PrototypePattern.ShallowClone.Father;
import com.sedion.mynawang.Chapter06_PrototypePattern.ShallowClone.Person;

import java.io.IOException;

/**
 * 原型模式测试
 * @auther mynawang
 * @create 2017-01-03 11:41
 */
public class Chapter06_PrototypePattern_test {

    private static void PrototypePattern_test1() {
        Prototype prototypeA = new ConcretePrototypeA();
        Prototype prototypeB = prototypeA.clone();
        System.out.println(prototypeA == prototypeB);
        System.out.println(prototypeA.equals(prototypeB));
        System.out.println(prototypeA.getClass() == prototypeB.getClass());
    }

    private static void ShallowClone_test1() {
        Father father = new Father("我是父亲", 80);

        Person person1 = new Person();
        person1.setName("我是儿子1");
        person1.setAge(50);
        person1.setFather(father);

        Person person2 = person1.clone();

        System.out.println(person1 == person2);
        System.out.println(person1.getFather() == person2.getFather());

    }

    private static void DeepClone_test1() throws IOException, ClassNotFoundException {

        com.sedion.mynawang.Chapter06_PrototypePattern.DeepClone.Father father =
                new com.sedion.mynawang.Chapter06_PrototypePattern.DeepClone.Father("我是父亲", 80);

        com.sedion.mynawang.Chapter06_PrototypePattern.DeepClone.Person person1 =
                new com.sedion.mynawang.Chapter06_PrototypePattern.DeepClone.Person();
        person1.setName("我是儿子1");
        person1.setAge(50);
        person1.setFather(father);

        com.sedion.mynawang.Chapter06_PrototypePattern.DeepClone.Person person2 = person1.deepClone();

        System.out.println(person1 == person2);
        System.out.println(person1.getFather() == person2.getFather());
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DeepClone_test1();
    }




}
