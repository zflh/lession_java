package com.dashidan.lesson15;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇: 15.Java异常
 * 测试finally return
 */
public class Demo2 {
    public static void main(String[] args) {
        int result = testFinallyReturn();
        System.out.println("result: " + result);
    }

    public static int testFinallyReturn() {
        int a;
        try {
            a = 1;
            /** 抛出异常*/
            System.out.println("抛出异常");
            throw new NullPointerException();
        } catch (NullPointerException e) {
            a = 2;
            /** 捕获异常*/
            System.out.println("捕获异常");
            e.printStackTrace();
            /** 注意这里没有返回*/
            System.out.println("注意这里没有返回");
            return a;
        } finally {
            a = 3;
            System.out.println("finally执行返回");
            /** 抛出异常后, 执行finally的语句, 如果这里返回，不再执行catch中语句*/
            return a;
        }
    }
}
