package com.dashidan.lesson15;

import java.util.*;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇: 15.Java集合类
 */
public class Demo1 {
    public static void main(String[] args) {
        testArrayList();
        testVector();
        testStack();
        testHashMap();
        testHashSet();
    }

    /**
     * ArrayList基本操作
     */
    public static void testArrayList() {
        System.out.println("---ArrayList---");
        /** ArrayList添加对象*/
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("ArrayList 长度: " + arrayList.size());
        for (int i = 0; i < 5; i++) {
            arrayList.add(i);
        }
        System.out.println("ArrayList 长度: " + arrayList.size());
        /** ArrayList删除对象*/
        arrayList.remove(3);
        System.out.println("ArrayList 长度: " + arrayList.size());
        /** ArrayList 遍历方式 1 增强for循环, 获得值, 无法获得索引*/
        for (Integer intNum : arrayList) {
            System.out.println(intNum);
        }
        /** ArrayList 遍历方式 2普通for循环, 值和索引都能得到*/
        for (int i = 0; i < arrayList.size(); i++) {
            int num = arrayList.get(i);
            System.out.println(num);
        }
        /** ArrayList 遍历方式 3 迭代器 Itertor, 获得值, 无法获得索引*/
        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            int num = it.next();
            System.out.println(num);
        }
    }

    /**
     * Vector基本操作
     */
    public static void testVector() {
        System.out.println("---Vector---");
        /** Vector*/
        Vector<Integer> vector = new Vector<>();
        System.out.println("Vector 长度: " + vector.size());
        for (int i = 0; i < 5; i++) {
            vector.add(i);
        }
        System.out.println("Vector 长度: " + vector.size());
        /** Vectort 删除对象*/
        vector.remove(3);
        System.out.println("Vector 长度: " + vector.size());
        /** Vectort 遍历方式 1 增强for循环, 获得值, 无法获得索引*/
        for (Integer intNum : vector) {
            System.out.println(intNum);
        }
        /** Vectort 遍历方式 2普通for循环, 值和索引都能得到*/
        for (int i = 0; i < vector.size(); i++) {
            int num = vector.get(i);
            System.out.println(num);
        }
        /** Vectort 遍历方式 3 迭代器 Itertor, 获得值, 无法获得索引*/
        Iterator<Integer> it = vector.iterator();
        while (it.hasNext()) {
            int num = it.next();
            System.out.println(num);
        }
    }

    /**
     * Stack基本操作
     */
    public static void testStack() {
        System.out.println("---Stack---");
        /** Stack*/
        Stack<Integer> stack = new Stack<>();
        System.out.println("Stack 长度: " + stack.size());
        for (int i = 0; i < 5; i++) {
            /** 入栈*/
            stack.push(i);
        }
        System.out.println("Stack 长度: " + stack.size());
        /** Stack pop 出栈*/
        stack.pop();
        System.out.println("Stack 长度: " + stack.size());
        /** Stack peek 得到栈顶的元素*/
        int peekNum = stack.peek();
        System.out.println("Stack peekNum: " + peekNum);
        /** Stack search 检测一个元素在堆栈中的位置*/
        int pos = stack.search(3);
        System.out.println("Stack search pos: " + pos);
        /** Stack 遍历方式 1 增强for循环*/
        for (Integer intNum : stack) {
            System.out.println(intNum);
        }
    }

    /**
     * HashMap基本操作
     */
    public static void testHashMap() {
        System.out.println("---HashMap---");
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        System.out.println("HashMap 长度: " + hashMap.size());
        for (int i = 0; i < 5; i++) {
            /** HashMap 添加对象*/
            hashMap.put(i, 100 + i);
        }

        System.out.println("HashMap 长度: " + hashMap.size());
        /** HashMap 删除对象*/
        hashMap.remove(2);
        System.out.println("HashMap 长度: " + hashMap.size());
        /** HashMap 遍历方式 1 增强for循环遍历 Entry */
        System.out.println("HashMap 遍历方式 1 增强for循环遍历 Entry ");
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            System.out.println("hashMap key: " + entry.getKey() + " hashMap value: " + entry.getValue());
        }

        /** HashMap 遍历方式 2 通过迭代器遍历 key */
        System.out.println("HashMap 遍历方式 2 通过迭代器遍历 key *");
        Iterator<Integer> it0 = hashMap.keySet().iterator();
        while (it0.hasNext()) {
            int key = it0.next();
            int value = hashMap.get(key);
            System.out.println("key: " + key + " value: " + value);
        }

        /** HashMap 遍历方式 3 通过 增强for循环遍历 key*/
        System.out.println("HashMap 遍历方式 3 通过 增强for循环遍历 key");
        for (Integer key : hashMap.keySet()) {
            int value = hashMap.get(key);
            System.out.println("key: " + key + " value: " + value);
        }

        /** HashMap 遍历方式 4 通过迭代器遍历 values, 无法得到 key值 */
        System.out.println("HashMap 遍历方式 4 通过迭代器遍历 values, 无法得到 key值 ");
        Iterator<Integer> it1 = hashMap.values().iterator();
        while (it1.hasNext()) {
            int value = it1.next();
            System.out.println("value: " + value);
        }

        /** HashMap 遍历方式 5 通过 增强for循环遍历 values, 无法得到 key值 */
        System.out.println("HashMap 遍历方式 5 通过 增强for循环遍历 values, 无法得到 key值 ");
        for (Integer value : hashMap.values()) {
            System.out.println("value: " + value);
        }
    }

    /**
     * HashSet基本操作
     */
    public static void testHashSet() {
        System.out.println("---HashSet---");
        HashSet<Integer> hashSet = new HashSet<>();
        System.out.println("HashSet 长度: " + hashSet.size());
        /** 循环两次，放入重复的1-5*/
        for (int i = 0; i < 5; i++) {
            hashSet.add(i);
        }
        for (int i = 0; i < 5; i++) {
            hashSet.add(i);
        }
        System.out.println("HashSet 长度: " + hashSet.size());
        /** HashSet 遍历方式 1 增强for循环*/
        for (Integer intNum : hashSet) {
            System.out.println(intNum);
        }
    }
}
