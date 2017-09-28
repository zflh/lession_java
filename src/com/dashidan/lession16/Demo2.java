package com.dashidan.lession16;

import java.util.Random;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇: 16. Java位运算
 * 位运算判断奇偶
 */
public class Demo2 {
    public static void main(String[] args) {
        /** 随机一个整数*/
        int a = new Random().nextInt();
        /** 判断奇偶性*/
        String numStr = ((a & 1) == 1) ? "奇数" : "偶数";
        System.out.println("随机数为: " + a + " 是: " + numStr);
    }
}
