package com.dashidan.lesson12;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇: 12.Java对象
 * 抽象类创建对象
 */
public class Demo10 {
    public static void main(String[] args) {
        AbstractPet abstractPet = new AbstractPet() {
            @Override
            public void sleep() {
                System.out.println("AbstractPet sleep.");
            }
        };
        abstractPet.sleep();
    }
}
