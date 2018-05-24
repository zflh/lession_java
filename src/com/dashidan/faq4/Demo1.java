package com.dashidan.faq4;

import java.util.ArrayList;

/**
 * 大屎蛋教程网-dashidan.com
 * 4.ConcurrentModifyException的产生原因及如何避免
 * Created by 大屎蛋 on 2018/5/24.
 */
public class Demo1 {

    public static void main(String[] args) {
        /** 初始化集合类*/
        ArrayList<TestObj> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(new TestObj(i));
        }

        /** 遍历时删除元素*/
        for (TestObj obj : list) {
            if (obj.getValue() < 10) {
                /** 这里会抛出ConcurrentModificationException*/
                list.remove(obj);
            }
        }
    }
}

class TestObj {
    int value;

    public TestObj(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
