package com.sedion.mynawang.Chapter06_PrototypePattern.ShallowClone;

/**
 * 克隆原型
 * @auther mynawang
 * @create 2017-01-03 15:01
 */
public class Person implements Cloneable{

    private String name;

    private int age;

    private Father father;

    public Person clone() {
        Object obj = null;
        try {
            obj = super.clone();
            return (Person) obj;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
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

    public Father getFather() {
        return father;
    }

    public void setFather(Father father) {
        this.father = father;
    }
}
