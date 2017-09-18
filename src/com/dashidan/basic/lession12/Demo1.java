package com.dashidan.basic.lession12;

/**
 * 大屎蛋教程网-dashidan.com
 *
 * Java教程基础篇: 12.Java三目运算符： ？：
 */
public class Demo1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = a > b ? a : b;
        /** a > b 为false,所以取":"后边的值b赋值给c, 故c为2.*/
        System.out.println(c);
    }
}
