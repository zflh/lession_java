package com.dashidan.basic.lession6;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇: 6. Java运算符
 * Java三目运算符
 */
public class Demo6 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = a > b ? a : b;
        /** a > b 为false,所以取":"后边的值b赋值给c, 故c为2.*/
        System.out.println(c);
    }
}
