package com.dashidan.basic.lession23;

/**
 * 大屎蛋教程网-dashidan.com
 *
 * Java教程基础篇: ：23.Java字符串变量：String
 */
public class Demo1 {
    public static void main(String[] args) {
        String s0 = "大屎蛋教程网";
        String s1 = "大屎蛋教程网";
        String s2 = new String("大屎蛋教程网");
        /** equal比较字符串内容*/
        boolean isSame = s0.equals(s1);
        System.out.println("1 equals isSame : " + isSame);
        isSame = s0.equals(s1);
        System.out.println("2 equals isSame : " + isSame);
        isSame = s0.equals(s2);
        System.out.println("3 equals isSame : " + isSame);
        /** s2 是通过new的方式从新创建的字符串对象，s0 s2 指向不同的内存地址*/
        isSame = (s0 == s2);
        System.out.println("4 == isSame : " + isSame);
        isSame = (s0 == s1);
        /** 这里里的赋值，java虚拟机做了处理，自动指向了同一个字符串*/
        System.out.println("5 == isSame : " + isSame);
        /** 改变字符串 s0*/
        s0 += "aaa";
        /** s0 发生变化*/
        System.out.println("s0 " + s0);
        /** s1 没有发生变化*/
        System.out.println("s1 " + s1);
        /** 字符串s0 发生改变，虚拟机自动新建了一个字符串对象，s0 s1不再指向同一个字符串*/
        isSame = (s0 == s1);
        System.out.println("6 == isSame : " + isSame);
    }
}