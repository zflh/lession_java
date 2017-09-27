package com.dashidan.basic.lession17;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇: 17.Java转义字符
 */
public class Demo1 {
    public static void main(String[] args) {
        char a = '\\';
        char b = '\"';
        /** 这个会报错，Java中无法转义\? */
        char d = '\'';
        /** 8进制整数*/
        char e = '\100';
        /** unicode变化转义*/
        char g = '\u1111';
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("d: " + d);
        System.out.println("e: " + e);
        System.out.println("g: " + g);
    }
}
