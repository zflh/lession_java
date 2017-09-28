package com.dashidan.lession12;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇: 12.Java对象
 * 对象的继承
 * Cat 继承自 Pet类
 */
public class Cat extends Pet {
    public void eatFish() {
        System.out.println("Cat eatFish.");
    }

    @Override
    public void eat() {
        System.out.println("Cat eat");
    }

    /**
     * 调用父类方法
     */
    public void petEat() {
        super.eat();
    }
}
