package com.dashidan.lesson23;

import java.util.ArrayList;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇:  23.final关键字作用详解
 * final关键字应用场景 final在集合中的应用
 */
public class Demo5 {

    public static void main(String[] args) {
        final ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);

        list.remove(0);

        /** 重新赋值会报错*/
//        list = new ArrayList<>();
    }

}

