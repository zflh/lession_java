package com.dashidan.basic.lession13;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇: 13. Java包装类
 */
public class Demo1 {
    public static void main(String[] args) {
        /** 将int类型转换为Integer类型*/
        int intNum = 10;
        Integer integer = new Integer(intNum);
        /** 将Integer类型转换为int类型*/
        int intValue = integer.intValue();
        System.out.println(" intNum " + intNum + " intValue " + intValue);

        /** 将字符串"666"按照十进制转换为int,则结果为666*/
        int n0 = Integer.parseInt("666");
        int n1 = Integer.parseInt("666", 10);
        /** 将字符串"12"按照十六进制转换为int,则结果为18*/
        int n2 = Integer.parseInt("12", 16);
        /** 将字符串"FF"按照十六进制转换为int,则结果为255*/
        int n3 = Integer.parseInt("FF", 16);
        System.out.println("n0 : " + n0 + " n1: " + n1 + " n2: " + n2 + " n3: " + n3);


        /** int类型会自动转换为Integer类型*/
        int n = 12;
        /** Integer类型会自动转换为int类型*/
        Integer m = n;
        if (m == n) {
            System.out.println(m == n);
        }
    }
}
