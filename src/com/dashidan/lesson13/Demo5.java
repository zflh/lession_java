package com.dashidan.lesson13;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇: 13.Java对象
 * 对象的继承
 */
public class Demo5 {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        /** 调用父类的方法*/
        cat.walk();
        dog.walk();
        /** 调用子类的方法*/
        cat.eatFish();
        dog.eatBone();
    }

}
