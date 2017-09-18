package com.dashidan.basic.lession7;

/**
 * 大屎蛋教程网-dashidan.com
 *
 * Java教程基础篇: 7.Java算数运算符： 加, 减, 乘, 除(取模, 取余).
 */
public class Demo1 {
    public static void main(String[] args) {
        /** 加`+`*/
        int a = 1;
        int b = 2;
        int c = a + b;
        System.out.println(c);
        /** 减`-`*/
        a = 1;
        b = 2;
        c = a - b;
        System.out.println(c);
        /** 乘`*` */
        a = 1;
        b = 2;
        c = a * b;
        System.out.println(c);
        /** 除-取模`/`对整数取模运算,相当于取结果的整数,去掉余数.*/
        a = 1;
        b = 2;
        c = a / b;
        System.out.println(c);
        /** 除-取余`%`对整数取余运算,相当于取结果的余数.*/
        a = 1;
        b = 2;
        c = a % b;
        System.out.println(c);
    }
}
