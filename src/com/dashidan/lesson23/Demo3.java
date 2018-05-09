package com.dashidan.lesson23;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇:  23.final关键字作用详解
 * final关键字应用场景 final关键字初始化
 */
public class Demo3 {

    /**
     * final 关键字 定义时初始化
     */
    final int num0 = 0;
    /**
     * final 关键字 构造函数初始化
     */
    final int num1;

    Demo3(int n1) {
        this.num1 = n1;
    }

    public int getNum0() {
        return num0;
    }

    public int getNum1() {
        return num1;
    }
}
