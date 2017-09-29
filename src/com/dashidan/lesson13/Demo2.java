package com.dashidan.lesson13;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇: 13. Java包装类
 * 整数转化为字符串
 */
public class Demo2 {
    public static void main(String[] args) {
        int count = 100000;
        long t1 = System.currentTimeMillis();
        System.out.println("");
        for (int i = 0; i < count; i++) {
            Integer in = new Integer(100);
            String s1 = in.toString();
        }
        long t2 = System.currentTimeMillis();
        System.out.println("t2 - t1 " + (t2 - t1));
        for (int i = 0; i < count; i++) {
            String s2 = 100 + "";
        }
        long t3 = System.currentTimeMillis();

        System.out.println("t3 - t2 " + (t3 - t2));
    }
}
