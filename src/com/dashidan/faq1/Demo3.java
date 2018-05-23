package com.dashidan.faq1;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 大屎蛋教程网-dashidan.com
 * HashMap与ConcurrentHashMap的区别于应用场景
 * Created by 大屎蛋 on 2018/5/18.
 */
public class Demo3 {

    public static void main(String[] args) {
        /** 全局HashMap*/
        HashMap<Integer, Integer> hashMap = new HashMap();

        /** 多线程编辑1000次*/
        for (int i = 0; i < 1000; i++) {
            hashMap.put(i, i);
        }

        new Thread(new AddThread(hashMap)).start();
        new Thread(new RemoveThread(hashMap)).start();

        /** 读取线程*/
        new Thread(new IteratorThread(hashMap)).start();
        /** 输出最终结果*/
    }
}

class AddThread implements Runnable {
    Map<Integer, Integer> hashMap;

    public AddThread(Map<Integer, Integer> hashMap) {
        this.hashMap = hashMap;
    }

    @Override
    public void run() {
        while (true) {
            int random = new Random().nextInt();
            hashMap.put(random, random);
        }
    }
}

class RemoveThread implements Runnable {
    Map<Integer, Integer> hashMap;

    public RemoveThread(Map<Integer, Integer> hashMap) {
        this.hashMap = hashMap;
    }

    @Override
    public void run() {
        int random = new Random().nextInt(1000);
//        hashMap.put(random, random);
        while (true) {
            hashMap.remove(random);
        }
    }
}


class IteratorThread implements Runnable {

    Map<Integer, Integer> hashMap;

    public IteratorThread(Map<Integer, Integer> hashMap) {
        this.hashMap = hashMap;
    }

    @Override
    public void run() {
        System.out.println("------------------ " + hashMap.size());
        for (Integer value : hashMap.values()) {
//            System.out.println("value " + value);
        }
        System.out.println("+++++++++++++++++++ " + hashMap.size());
    }
}




