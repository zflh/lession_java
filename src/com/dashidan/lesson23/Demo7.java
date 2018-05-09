package com.dashidan.lesson23;

import java.util.ArrayList;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇:  23.final关键字作用详解
 * final关键字应用场景 final在集合中的应用
 */
public class Demo7 {
    public static void main(String[] args) {
        ArrayList<Test2> list = new ArrayList<>();
        Test2 a = new Test2(1);
        Test2 b = new Test2(2);
        Test2 c = new Test2(3);

        list.add(a);
        list.add(b);
        list.add(c);

        /** final对象可以移除 移除第一个final数据*/
        list.remove(0);
        /** 修改余下的第一个位*/
        list.set(0, new Test2(4));

        for (Test2 test2 : list) {
            /** 遍历修改数据 将集合对象中的索引 设置为 空*/
            test2 = null;
        }

        for (Test2 aList : list) {
            /** 输出集合中的数据 */
            System.out.println("aList " + aList);
        }
    }
}

class Test2 {
    int num;

    public Test2(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "Test2{" +
                "num=" + num +
                '}';
    }
}
