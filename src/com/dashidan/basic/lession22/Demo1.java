package com.dashidan.basic.lession22;

/**
 * 大屎蛋教程网-dashidan.com
 *
 * Java教程基础篇: 22.java数组：array
 */
public class Demo1 {
    public static void main(String[] args) {
        /** 定义整型数组*/
        int[] intArray = new int[3];

        /** 通过for循环遍历数组, 初始化数据*/
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }

        /** 通过for循环遍历数组, 输出数据*/
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
