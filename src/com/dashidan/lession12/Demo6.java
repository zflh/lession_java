package com.dashidan.lession12;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇: 12.Java对象
 * 对象的多态
 */
public class Demo6 {
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
