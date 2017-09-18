package com.dashidan.basic.lession20;

/**
 * 大屎蛋教程网-dashidan.com
 *
 * Java教程基础篇: 20.Java对象：Object, class, new
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
