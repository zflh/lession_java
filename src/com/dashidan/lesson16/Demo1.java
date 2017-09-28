package com.dashidan.lesson16;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇: 16. Java位运算
 */
public class Demo1 {
    public static void main(String[] args) {
        /** 10进制*/
        int a = 100;
        /** 8进制*/
        int b = 0100;
        /** 16进制*/
        int c = 0x100;
        System.out.println("a: " + a + " b: " + b + " c: " + c);
        int d = -0100;
        int e = -0x100;
        System.out.println("d: " + d + " e: " + e);
    }
}
