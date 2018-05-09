package com.dashidan.lesson23;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇:  23.final关键字作用详解
 * final关键字应用场景  配置表解析
 */
public class Demo2 {

    /**
     * 解析配置后的数据对象 设置为final类型的
     * 这样通过构造函数初始化以后 就无法改变其值
     */
    private final int id;
    private final int num;

    public Demo2(int id, int num) {
        this.id = id;
        this.num = num;
    }

    public int getId() {
        return id;
    }

    public int getNum() {
        return num;
    }
}
