package com.dashidan.basic.lession16;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇: 16. Java位运算
 * 不用临时变量交换两个数
 */
public class Demo3 {
    public static void main(String[] args) {
        /** 数a两次异或同一个数b(a=a^b^b)仍然为原值.*/
        int a = 100;
        int b = 666;

        a = a ^ b;
        b = b ^ a;
        a = a ^ b;

        System.out.println("a: " + a + " b " + b);
    }
}
