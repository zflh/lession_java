package com.dashidan.profile;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 大屎蛋教程网-dashidan.com
 * for循环中的效率优化
 * Created by 大屎蛋 on 2018/5/22.
 */
public class Demo2 {
    public static void main(String[] args) {
        int count = 1000000;
        /** 初始化HashMap*/
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        long t0 = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            hashMap.put(i, i);
        }

        /** 遍历Key获取Value*/
        long t1 = System.currentTimeMillis();
        for (Integer key : hashMap.keySet()) {
            int value = hashMap.get(key);
        }

        /** 遍历value*/
        long t2 = System.currentTimeMillis();
        for (Integer v : hashMap.values()) {
            int value = v;
        }

        long t3 = System.currentTimeMillis();
        /** 遍历Entry*/
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
        }

        long t4 = System.currentTimeMillis();
        /** Iterator 遍历*/
        Iterator<Integer> integerIterator = hashMap.values().iterator();
        while (integerIterator.hasNext()) {
            int value = integerIterator.next();
        }

        long t5 = System.currentTimeMillis();

        System.out.println(t1 - t0);
        System.out.println(t2 - t1);
        System.out.println(t3 - t2);
        System.out.println(t4 - t3);
        System.out.println(t5 - t4);
    }
}
