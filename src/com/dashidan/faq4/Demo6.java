package com.dashidan.faq4;

import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 大屎蛋教程网-dashidan.com
 * 4.ConcurrentModifyException的产生原因及如何避免
 * Created by 大屎蛋 on 2018/5/24.
 */
public class Demo6 {
    public static void main(String[] args) {
        /** 初始化集合类*/
        ConcurrentHashMap<Integer, TestObj> map = new ConcurrentHashMap<>();
        for (int i = 0; i < 1000000; i++) {
            map.put(i, new TestObj(i));
        }

        /**启动一个线程随机删除数据*/
        new Thread(new ThreadClass1(map)).start();

        /** 遍历元素*/
        Iterator<TestObj> iterator = map.values().iterator();
        while (iterator.hasNext()) {
            TestObj testObj = iterator.next();
        }

        System.out.println("end");
    }
}

class ThreadClass1 implements Runnable {

    Map<Integer, TestObj> map;

    public ThreadClass1(Map<Integer, TestObj> map) {
        this.map = map;
    }

    @Override
    public void run() {
        while (true) {
            if (map.size() > 0) {
                int index = new Random().nextInt(map.size());
                map.remove(index);
            }
        }
    }
}