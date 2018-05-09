package com.dashidan.lesson23;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇:  23.final关键字作用详解
 * final关键字应用场景 final在数组中的应用
 */
public class Demo8 {

    public static void main(String[] args) {

        /** 定义一个final 数组*/
        final int[] array = new int[3];

        for (int i = 0; i < array.length; i++) {
            /** 数组中赋值final类型数组*/
            final int n = i;
            array[i] = n;
        }

        /** 无法再次赋值， 会报错*/
//        array = new int[3];

        for (int i = 0; i < array.length; i++) {
            /** 改变数组中的数据*/
            array[i] = i * 10;
            System.out.println(" array[i] " + array[i]);
        }
    }
}
