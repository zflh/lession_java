package com.dashidan.promote.lession9;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程进阶篇: 9.Java对象(8)：抽象方法与抽象类：abstract
 * 通过匿名内部类创建抽象类
 */
public class Demo2 {
    public static void main(String[] args) {
        /** 通过匿名内部类，用new的方式创建抽象类*/
        Pet pet = new Pet() {

            @Override
            public void eat() {
                System.out.println("2 Pet eat.");
            }
        };

        pet.eat();
    }
}
