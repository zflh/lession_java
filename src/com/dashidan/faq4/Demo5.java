package com.dashidan.faq4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 大屎蛋教程网-dashidan.com
 * 4.ConcurrentModifyException的产生原因及如何避免
 * Created by 大屎蛋 on 2018/5/24.
 */
public class Demo5 {
    public static void main(String[] args) {
        /** 初始化集合类*/
        ArrayList<TestObj> list = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            list.add(new TestObj(i));
        }

        CopyOnWriteArrayList<TestObj> list1 = new CopyOnWriteArrayList<>(list);

        /**启动一个线程随机删除数据*/
        new Thread(new ThreadClass(list1)).start();

        /** 遍历元素*/
        Iterator<TestObj> iterator = list1.iterator();
        while (iterator.hasNext()) {
            TestObj testObj = iterator.next();
        }

        System.out.println("end");
    }
}
