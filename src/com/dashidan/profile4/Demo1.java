package com.dashidan.profile4;

/**
 * 大屎蛋教程网-dashidan.com
 * 4.3目运算符效率优化
 *
 * Created by 大屎蛋 on 2018/5/25.
 */
public class Demo1 {
    public static void main(String[] args) {
        int a = 99;
        int count = 1000000000;

        long t1 = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            a = i < 1000 ? 100 : 200;
        }

        long t2 = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            if (i < 100) {
                a = 100;
            } else {
                a = 200;
            }
        }


        long t3 = System.currentTimeMillis();

        System.out.println(t2 - t1);
        System.out.println(t3 - t2);
    }
}
