package com.dashidan.profile3;

/**
 * 大屎蛋教程网-dashidan.com
 * 3.java浮点数运算和整数型运算的效率比较
 *
 * Created by 大屎蛋 on 2018/5/24.
 */
public class Demo1 {

    public static void main(String[] args) {
        int count = 2000000000;
        /** 浮点数运算*/
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            double d = 999999999.9d + 999999999.9d / 2d - 999999999.9d;
            d = d * 2d;
        }
        long t2 = System.currentTimeMillis();
        /** 整数数运算*/
        for (int i = 0; i < count; i++) {
            int n = 999999999 + 999999999 / 2 - 999999999;
            n = n * 2;
        }
        long t3 = System.currentTimeMillis();
        System.out.println((t2 - t1));
        System.out.println((t3 - t2));
    }
}
