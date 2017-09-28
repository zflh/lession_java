package com.dashidan.lesson10;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇: 10. java数组
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
        System.out.println("-------------------------");
        /** 增强for循环*/
        for (int anIntArray : intArray) {
            System.out.println(anIntArray);
        }
    }
}
