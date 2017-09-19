package com.dashidan.promote.lession8;


/**
 * 大屎蛋教程网-dashidan.com
 *
 * Java教程进阶篇: 8.Java对象(7)：引用当前对象与父对象：this, super
 * Cat 继承自 Pet类
 */
public class Cat extends Pet {
    public void eat() {
        /** 调用父类对象的eat方法*/
        super.eat();
        System.out.println("Cat eat.");
    }
}
