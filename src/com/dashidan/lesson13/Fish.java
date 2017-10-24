package com.dashidan.lesson13;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇: 13.Java对象
 * 抽象方法与抽象类
 * Fish 类 继承自 AbstractPet类
 */
public class Fish extends AbstractPet {
    /**
     * 实现抽象方法 sleep
     */
    @Override
    public void sleep() {
        System.out.println("Never sleep.");
    }
}
