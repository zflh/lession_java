package com.dashidan.promote.lession5;

/**
 * 大屎蛋教程网-dashidan.com
 *
 * Java教程进阶篇: 5.Java对象(4)：对象比较：equal
 */
public class Demo1 {
    public static void main(String[] args) {
        SimpleObject simpleObject1 = new SimpleObject();
        SimpleObject simpleObject2 = new SimpleObject();
        SimpleObject simpleObject3 = simpleObject1;

        /** == 比较， 比较的是对象引用地址是否相同*/
        /** simpleObject2 是通过new从新创建的对象, 故与simpleObject1 指向的地址不同*/
        System.out.println(simpleObject1 == simpleObject2);
        /** simpleObject3 是通simpleObject1 引用传递，指向同一个地址*/
        System.out.println(simpleObject1 == simpleObject3);
        /** equals 是通过对象的hash值来比较是否相同*/
        System.out.println(simpleObject1.equals(simpleObject2));
        System.out.println(simpleObject1.equals(simpleObject3));
    }
}
