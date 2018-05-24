package com.dashidan.profile;

import java.util.ArrayList;

/**
 * 大屎蛋教程网-dashidan.com
 * for循环中的效率优化
 * Created by 大屎蛋 on 2018/5/22.
 */
public class Demo1 {
    public static void main(String[] args) {

        /** 初始化数组*/
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        /** 普通for循环遍历*/
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            int n = list.get(i);
        }

        /** 增强for循环遍历*/
        long t2 = System.currentTimeMillis();
        for (Integer i : list) {
            int n = i;
        }
        long t3 = System.currentTimeMillis();

        System.out.println(t2 - t1);
        System.out.println(t3 - t2);
    }
}
