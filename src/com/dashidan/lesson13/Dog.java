package com.dashidan.lesson13;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇: 13.Java对象
 * 对象的继承
 * Dog 继承自 Pet类
 */
public class Dog extends Pet {
    public void eatBone() {
        System.out.println("Dog eatBone.");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat");
    }
}
