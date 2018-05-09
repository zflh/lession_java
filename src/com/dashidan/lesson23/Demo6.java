package com.dashidan.lesson23;

import java.util.ArrayList;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇:  23.final关键字作用详解
 * final关键字应用场景 final在集合中的应用
 */
public class Demo6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        final int a = 0;
        final int b = 0;
        final int c = 0;
        list.add(a);
        list.add(b);
        list.add(c);

        /** final对象可以移除 移除第一个final数据*/
        list.remove(0);
        /** 修改余下的第一个位*/
        list.set(0, 100);

        for (Integer aList : list) {
            /** 遍历修改数据 由于 基本类型是值传递 这里 可以用原final值做修改操作*/
            aList++;
            System.out.println("n " + aList);
        }

        for (Integer aList : list) {
            /** 输出原数据*/
            System.out.println("aList " + aList);
        }
    }
}
