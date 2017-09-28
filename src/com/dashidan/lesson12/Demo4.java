package com.dashidan.lesson12;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇: 12.Java对象
 * 对象封装
 */
public class Demo4 {
    public static void main(String[] args) {
        TestPackaging packaging = new TestPackaging();
        packaging.setName("哈拆迁");
        /** 通过公开接口访问Pet的私有属性name*/
        System.out.println(packaging.getName());
    }
}

/**
 * 封装测试类
 */
class TestPackaging {
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

