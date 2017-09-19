package com.dashidan.promote.lession5;

/**
 * 大屎蛋教程网-dashidan.com
 *
 * Java教程进阶篇: 5.Java对象(4)：封装
 */
public class Pet {
    /**
     * 私有属性名字
     */
    private String name;

    /**
     * 获得宠物的名字, 开放接口
     */
    public String getName() {
        return name;
    }

    /**
     * 设置宠物的名字, 开放接口
     */
    public void setName(String name) {
        this.name = name;
    }
}
