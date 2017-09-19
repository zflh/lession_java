package com.dashidan.promote.lession9;

/**
 * 大屎蛋教程网-dashidan.com
 *
 * Java教程进阶篇: 9.Java对象(8)：抽象方法与抽象类：abstract
 * Cat类 继承自抽象类 Pet, 必须实现父类的抽象方法
 */
public class Cat extends Pet {

    @Override
    public void eat() {
        System.out.println("Cat eat.");
    }
}
