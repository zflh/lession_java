package com.dashidan.promote.lession6;

/**
 * 大屎蛋教程网-dashidan.com
 *
 * Java教程进阶篇: 6.Java对象(5)：继承：extends
 */
public class Demo1 {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        /** 调用父类的方法*/
        cat.eat();
        dog.eat();
        /** 调用子类的方法*/
        cat.eatFish();
        dog.eatBone();
    }

}
