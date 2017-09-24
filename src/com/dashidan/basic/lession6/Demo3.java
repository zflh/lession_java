package com.dashidan.basic.lession6;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇: 6. Java运算符
 * Java自增,自减运算符
 */
public class Demo3 {
    public static void main(String[] args) {
        /** 前缀,后缀单独执行结果一样*/
        int i = 0;
        i++;
        System.out.println(i);
        int j = 0;
        ++j;
        System.out.println(j);
        /** 前缀,后缀放在运算过程中结果不同*/
        /** 前缀式*/
        int a = 0;
        i = 0;
        a = ++i;
        /** i使用前是0,此时i为0不加1,a为0. */
        System.out.println(a);
        /** 使用后i加1,i为1*/
        System.out.println(i);

        /** 后缀式*/
        /** 初始化a和i*/
        a = 0;
        i = 0;
        a = i++;
        /** i使用前是0,此时i为0不加1,a为0. */
        System.out.println(a);
        /** 使用后i加1,i为1*/
        System.out.println(i);
    }
}
