package com.dashidan.lesson8;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇:8. Java流程控制
 * return 语句
 */
public class Demo6 {
    public static void main(String[] args) {
        /** 执行无返回值的方法*/
        testReturn(1);
        int b = testReturnInt(2, 3);
        System.out.println("执行有返回值的方法: " + b);

    }

    public static void testReturn(int value) {
        System.out.println("执行无返回值的方法: " + value);
    }

    public static int testReturnInt(int p0, int p1) {
        return p0 + p1;
    }
}
