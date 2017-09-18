package com.dashidan.promote.lession3;

/**
 * 大屎蛋教程网-dashidan.com
 *
 * Java教程进阶篇: 3.Java对象(2)：对象初始化：构造函数.
 */
public class Demo2 {
    private int id;
    private String name;
    private String url;

    /**
     * 构造函数
     */
    public Demo2(int id, String name, String url) {
        /** 构造函数初始化成员变量*/
        System.out.println("执行Demo2构造函数");
        this.id = id;
        this.name = name;
        this.url = url;
        System.out.println("id " + id + " name " + name + " url " + url);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
