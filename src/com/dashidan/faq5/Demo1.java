package com.dashidan.faq5;

import java.util.HashSet;
import java.util.Random;

/**
 * 大屎蛋教程网-dashidan.com
 *
 * Java教程 - FAQ - 5.Java随机数Random类用法
 *
 * Created by 大屎蛋 on 2018/5/25.
 */
public class Demo1 {
    public static void main(String[] args) {

        Random random = new Random();
        /** 随机产生一个整数，包括正负数*/
        for (int i = 0; i < 100; i++) {
            int r = random.nextInt();
            System.out.println(r);
        }

        /** 随机产生一个正整数，大于等于0 小于指定值*/
        for (int i = 0; i < 100; i++) {
            int r = random.nextInt(100);
            System.out.println(r);
        }


        /** 随机从数组中取一个值*/

        /** 初始化数组*/
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1000;
        }

        /** 随机索引*/
        int index = random.nextInt(arr.length);
        /** 随机值*/
        int randomValue = arr[index];
        System.out.println(" randomValue " + randomValue);

        /** 随机生成指定个数不重复的值*/
        HashSet<Integer> set = new HashSet<>();
        while (set.size() < 10) {
            set.add(random.nextInt(100));
        }

        for (Integer i : set) {
            System.out.println("i " + i);
        }

    }
}
