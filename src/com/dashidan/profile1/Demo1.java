package com.dashidan.profile1;

import java.util.Arrays;

/**
 * 大屎蛋教程网-dashidan.com
 * 2.java数组复制的3种方式和效率对比
 *
 * Created by 大屎蛋 on 2018/5/23.
 */
public class Demo1 {

    public static void main(String[] args) {
        /** 初始化数组*/
        int len = 1000;
        int count = 10000000;
        int[] arr0 = new int[len];
        for (int i = 0; i < len; i++) {
            arr0[i] = i;
        }

        long t1 = System.currentTimeMillis();
        /** 1 for 循环复制*/
        for (int c = 0; c < count; c++) {
            int[] arr1 = new int[len];
            for (int i = 0; i < len; i++) {
                arr1[i] = arr0[i];
            }
        }

        long t2 = System.currentTimeMillis();
        /** 2 Arrays.copyOf复制数组*/
        for (int c = 0; c < count; c++) {
            int[] arr2 = Arrays.copyOf(arr0, arr0.length);
        }

        long t3 = System.currentTimeMillis();
        /** 3 System.arraycopy复制数组*/
        for (int c = 0; c < count; c++) {
            int[] arr3 = new int[len];
            System.arraycopy(arr0, 0, arr3, 0, arr0.length);
        }

        long t4 = System.currentTimeMillis();
        /** 4 Object.clone() 复制数组*/
        for (int c = 0; c < count; c++) {
            int[] arr4 = arr0.clone();
        }

        long t5 = System.currentTimeMillis();

        System.out.println("1 for 循环复制: " + (t2 - t1));
        System.out.println("2 Arrays.copyOf复制数组:  " + (t3 - t2));
        System.out.println("3 System.arraycopy复制数组:  " + (t4 - t3));
        System.out.println("4 Object.clone() 复制数组:  " + (t5 - t4));
    }
}
