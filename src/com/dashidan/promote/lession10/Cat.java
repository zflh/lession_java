package com.dashidan.promote.lession10;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程进阶篇: 10.Java对象(9)：接口implements，Interface
 * <p>
 * Cat继承自接口Pet, 实现接口中定义的方法
 */
public class Cat implements Pet {
    @Override
    public void eat() {
        System.out.println("Cat eat.");
    }
}
