package com.sedion.mynawang.Chapter06_PrototypePattern.DeepClone;


import java.io.*;

/**
 * 克隆原型
 * @auther mynawang
 * @create 2017-01-03 15:01
 */
public class Person implements Serializable{

    private String name;

    private int age;

    private Father father;

    public Person deepClone() throws IOException, ClassNotFoundException {

        // 将对象写入流
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);

        // 将对象从流中取出
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        return (Person) objectInputStream.readObject();

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
