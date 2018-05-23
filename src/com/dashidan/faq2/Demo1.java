package com.dashidan.faq2;

import java.util.HashMap;

/**
 * 大屎蛋教程网-dashidan.com
 * 2.HashMap中的put和putifabsense区别
 * Created by 大屎蛋 on 2018/5/18.
 */
public class Demo1 {

    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        hashMap.put(0, 0);

        hashMap.putIfAbsent(0, 1);
    }
}
