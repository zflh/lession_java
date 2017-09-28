package com.dashidan.lession9;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇: 9. Java对象与命名空间
 * java对象
 */
public class Demo1 {
    public static void main(String[] args) {
        Dog dog0 = new Dog();
        dog0.setName("泰日天");
        Dog dog1 = new Dog();
        dog1.setName("哈拆迁");
        System.out.println(dog0.getName());
        System.out.println(dog1.getName());
    }
}
