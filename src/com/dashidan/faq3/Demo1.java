package com.dashidan.faq3;

import java.util.ArrayList;

/**
 * 大屎蛋教程网-dashidan.com
 * 3.java ArrayListt原理及转化成数组常用方法
 * Created by 大屎蛋 on 2018/5/24.
 */
public class Demo1 {
    public static void main(String[] args) {

        /** 初始化ArrayList*/
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        /** 1 遍历ArrayList转化数组*/
        int[] arr0 = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr0[i] = list.get(i);
        }

        /** 2 ArrayList.toArray() 方法转化数组*/
        Object[] arr1 = list.toArray();

        /** 3 ArrayList.toArray(T[] a)方法转化数组*/
        Integer[] arr2 = new Integer[list.size() + 10];
        list.toArray(arr2);

        /** 数组转化为ArrayList*/
        int[] aaa = new int[100];
        ArrayList bbb = new ArrayList<Integer>();
        for (int i = 0; i < aaa.length; i++) {
            bbb.add(aaa[i]);
        }
    }
}
