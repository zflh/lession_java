package com.dashidan.promote.lession8;

/**
 * 大屎蛋教程网-dashidan.com
 *
 * Java教程进阶篇: 8.Java对象(7)：引用当前对象与父对象：this, super
 * Pet类
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

    public void eat() {
        System.out.println("Pet eat.");
    }
}
