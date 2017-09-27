package com.dashidan.basic.lession16;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇: 16. Java位运算
 * 移位运算符
 */
public class Demo4 {
    public static void main(String[] args) {
        int a = 4;
        int b = a << 2;
        System.out.println("a: " + a + " b: " + b);

        int c = 1000;
        int d = c >> 2;
        System.out.println("c: " + c + " d: " + d);


        int e = -1;
        int f = e >>> 2;
        System.out.println("e: " + e + " f: " + f);
    }
}
