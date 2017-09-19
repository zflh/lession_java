package com.dashidan.promote.lession10;

/**
 * 大屎蛋教程网-dashidan.com
 *
 * Java教程进阶篇: 10.Java对象(9)：接口implements，Interface
 *
 * Cat继承自接口Pet, 实现接口中定义的方法
 */
public class Cat implements Pet {
    @Override
    public void eat() {
        System.out.println("Cat eat.");
    }
}
