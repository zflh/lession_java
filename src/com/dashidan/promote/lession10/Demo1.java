package com.dashidan.promote.lession10;

/**
 * 大屎蛋教程网-dashidan.com
 *
 * Java教程进阶篇: 10.Java对象(9)：接口implements，Interface
 */
public class Demo1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        /** 调用接口中的常量*/
        System.out.println(Cat.LEG_NUM);
    }
}
