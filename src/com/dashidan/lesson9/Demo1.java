package com.dashidan.lesson9;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇:9. Java流程控制
 * 分支语句 if else
 */
public class Demo1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        if (a > b) {
            System.out.println("a > b");
        } else if (a == b) {
            System.out.println("a == b");
        } else {
            System.out.println("a < b");
        }
    }
}
