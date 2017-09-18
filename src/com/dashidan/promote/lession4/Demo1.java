package com.dashidan.promote.lession4;

/**
 * 大屎蛋教程网-dashidan.com
 *
 * Java教程进阶篇: 4.Java对象(3)：参数的值传递与引用传递：基本类型,String,Object
 * Demo1: 值传递
 */
public class Demo1 {

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
