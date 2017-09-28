package com.dashidan.lesson15;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇: 15.Java异常
 */
public class Demo1 {
    public static void main(String[] args) {
        try {
            /** 方法体*/
            testThrow();
            testThrows();
        } catch (NullPointerException e) {
            /** 异常处理*/
            System.out.println("run catch NullPointerException.");
            e.printStackTrace();
        } catch (Exception e) {
            /** 异常处理*/
            System.out.println("run catch Exception.");
            e.printStackTrace();
        } finally {
            /** finally语句*/
            System.out.println("run finally.");
        }
    }

    public static void testThrow() {
        /** 方法体*/
        throw new NullPointerException();
    }

    public static void testThrows() throws NullPointerException, ArithmeticException {
        /** 方法体*/
    }
}
