package com.dashidan.lesson13;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇: 13.Java对象
 * 对象的继承
 * Pet类 作为 父类
 */
public class Pet {
    /**
     * 私有成员变量name
     */
    private String name;

    public String getName() {
        /** 默认可以省略this. 系统会自动加上this.*/
        return name;
    }

    public void setName(String name) {
        /** this.name 通过this来表明引用当前对象成员变量name*/
        this.name = name;
    }

    public void walk() {
        System.out.println("Pet walk");
    }

    public void eat() {
        System.out.println("Pet eat");
    }
}
