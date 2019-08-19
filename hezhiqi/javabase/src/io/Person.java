package io;

/**
 * @author：HeZhiQi
 * @Date: 2019/8/19
 * @Description: io
 * @version: 1.0
 */

import java.io.Serializable;

/**
 * 使用当前类测试对象流的对象读写操作
 * 一个类若希望被对象流读写,那么这个类必须要
 * 实现接口:Serializable
 *
 */
public class Person implements Serializable{

    private String name;
    private String age;
    private String gender;

    public Person(String name, String age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
