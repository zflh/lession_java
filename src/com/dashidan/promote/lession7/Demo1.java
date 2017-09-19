package com.dashidan.promote.lession7;


/**
 * 大屎蛋教程网-dashidan.com
 *
 * Java教程进阶篇: 7.Java对象(6)：静态绑定动态绑定与多态
 */
public class Demo1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        /**
         * cat 和 dog 覆写了 父类的方法 eat 调用eat方法 时动态判断对象类型
         * cat 对象 执行了 Cat中的 eat方法
         * dog 对象 执行了 Dog中的 eat方法
         */
        cat.eat();
        dog.eat();
    }
}
