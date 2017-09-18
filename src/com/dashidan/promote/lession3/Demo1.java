package com.dashidan.promote.lession3;

/**
 * 大屎蛋教程网-dashidan.com
 *
 * Java教程进阶篇: 3.Java对象(2)：对象初始化：构造函数.
 */
public class Demo1 {

    public static void main(String args[]) {
        System.out.println("Demo1运行开始");
        Demo2 demo2 = new Demo2(1, "大屎蛋教程网", "dashidan.com");
        int id = demo2.getId();
        String url = demo2.getUrl();
        String name = demo2.getName();
        System.out.println("Demo1: id " + id + " url " + url + " name " + name);
        System.out.println("Demo1运行完毕");
    }
}
