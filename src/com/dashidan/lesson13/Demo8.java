package com.dashidan.lesson13;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇: 13.Java对象
 * 引用父对象super
 */
public class Demo8 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        /** 方法中调用super*/
        cat.petEat();
    }
}
