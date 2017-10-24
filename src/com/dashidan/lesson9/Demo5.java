package com.dashidan.lesson9;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇:9. Java流程控制
 * Java循环语句
 */
public class Demo5 {
    public static void main(String[] args) {
        /** for循环基本表达方式*/
        System.out.println("for循环基本表达方式");
        for (int i = 0; i < 3; i++) {
            System.out.println("i: " + i);
        }
        System.out.println("while循环基本表达方式");
        /** while循环基本表达方式*/
        int i = 0;
        while (i < 3) {
            System.out.println("i: " + i);
            i++;
        }
        System.out.println("do...while循环基本表达方式");
        /** do...while循环基本表达方式*/
        i = 0;
        do {
            System.out.println("i: " + i);
            i++;
        } while (i < 3);
        System.out.println("continue 在for循环中");
        /** continue 在for循环中*/
        for (i = 0; i < 3; i++) {
            if (i == 1) {
                continue;
            }
            System.out.println("i: " + i);
        }

        System.out.println("continue 在while循环中");
        i = 0;
        while (i < 3) {
            i++;
            if (i == 1) {
                continue;
            }
            System.out.println("i: " + i);
        }

        /**
         * 在`for`循环和`while`循环中,`break`语句作用一样.
         * 当`i==1`时,执行了`break`语句,结束了循环.所以只有`i: 0`的输出.
         */
        System.out.println("break在for循环中");
        for (i = 0; i < 3; i++) {
            if (i == 1) {
                break;
            }
            System.out.println("i: " + i);
        }
        System.out.println("break在while循环中");
        i = 0;
        while (i < 3) {
            if (i == 1) {
                break;
            }
            System.out.println("i: " + i);
            i++;
        }
    }
}
