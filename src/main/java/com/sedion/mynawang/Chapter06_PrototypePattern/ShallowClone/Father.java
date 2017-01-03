package com.sedion.mynawang.Chapter06_PrototypePattern.ShallowClone;

/**
 * 引用对象
 * @auther mynawang
 * @create 2017-01-03 15:00
 */
public class Father {

    private String name;

    private int age;

    public Father(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
