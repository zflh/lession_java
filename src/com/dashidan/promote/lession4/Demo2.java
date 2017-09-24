package com.dashidan.promote.lession4;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程进阶篇: 4.Java对象(3)：参数的值传递与引用传递：基本类型,String,Object
 * 引用传递
 */
public class Demo2 {
    public static void main(String[] args) {
        TestObject testObject1 = new TestObject();
        testObject1.setName("大屎蛋教程网");
        /** 对象赋值，这里是引用传递，testObject1 将对象地址赋值给 testObject2, 他们指向同一个对象*/
        TestObject testObject2 = testObject1;
        System.out.println("修改前 testObject1 name " + testObject1.getName());
        System.out.println("修改前 testObject2 name " + testObject2.getName());
        /** 改变 testObject2 的name，testObject1的name也发生变化，因为他们指向同一个数据*/
        testObject2.setName("dashidan.com");
        System.out.println("修改后 testObject1 name " + testObject1.getName());
        System.out.println("修改后 testObject2 name " + testObject2.getName());
    }
}