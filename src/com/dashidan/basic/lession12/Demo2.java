package com.dashidan.basic.lession12;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇: 12.Java对象
 * 值传递
 */
public class Demo2 {

    public static void main(String[] args) {
        int a = 1;
        String name = "大屎蛋";
        changeValue(a, name);
        /** 原值不变*/
        System.out.println("原值 a : " + a);
        /** 原字符串不变*/
        System.out.println("原值 name : " + name);
    }

    public static void changeValue(int num, String str) {
        num++;
        /** 输出改变的值, 改变了参数的值, 原值不变*/
        System.out.println("changeValue num : " + num);
        /** 添加字符串, 改变了作为参数传进来的字符串的值, 原字符串不变*/
        str += "dashidan.com";
        System.out.println("changeValue str : " + str);
    }
}
