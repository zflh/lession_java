package com.dashidan.faq4;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 大屎蛋教程网-dashidan.com
 * 4.ConcurrentModifyException的产生原因及如何避免
 * Created by 大屎蛋 on 2018/5/24.
 */
public class Demo3 {

    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        for (int n = 0; n < 1000000; n++) {
            /** 初始化集合类*/
            ArrayList<TestObj> list = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                list.add(new TestObj(i));
            }

            /** 遍历时删除元素*/
            Iterator<TestObj> iterator = list.iterator();
            while (iterator.hasNext()) {
                TestObj testObj = iterator.next();
                if (testObj.getValue() < 10) {
                    iterator.remove();
                }
            }
        }
        long t2 = System.currentTimeMillis();
        System.out.println("t2 - t1 " + (t2 - t1));
    }
}

