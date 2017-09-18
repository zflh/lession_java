package com.dashidan.basic.lession11;

/**
 * 大屎蛋教程网-dashidan.com
 *
 * Java教程基础篇: 11.Java逻辑运算符： ＆＆, ｜｜, ！, ^
 */
public class Demo1 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = a && b;
        /** a和b里不同时为true,故`&&`运算的结果为false*/
        System.out.println(c);
        a = true;
        b = false;
        c = a || b;
        /** a和b里面,a为true,故`||`运算的结果为true*/
        System.out.println(c);
        a = true;
        c = !a;
        /** c为 a的相反值,即为true*/
        System.out.println(c);
        a = true;
        b = false;
        c = false;
        boolean d = a ^ b;
        boolean e = b ^ c;
        /** a和b里不同,故`^`运算的结果为false,d为false*/
        System.out.println(d);
        /** c和d里同时为false,故`^`运算的结果为true,e为true*/
        System.out.println(e);
    }
}
