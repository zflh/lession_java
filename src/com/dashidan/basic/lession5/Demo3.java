package com.dashidan.basic.lession5;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇: 5. Java变量
 * 变量作用域
 */
public class Demo3 {
    /**
     * a,b 是成员变量,整个方法都可以调用.
     */
    public static int a;
    public static float b = 3.0f;

    public static void main(String args[]) {
        /**  在方法中调用成员变量, a为默认值, b为设定值*/
        System.out.println(a);
        System.out.println(b);

        testVar();
        /** 这里输出变量m, n,编译代码时,会报错,提示没有定义变量m,n*/
        //System.out.println(m);
        //System.out.println(n);
    }

    public static void testVar() {
        /**m,n 是成员变量,必须初始化赋值.作用域是在这个方法中. */
        int m = 0;
        int n = 1;
        System.out.println(m);
        System.out.println(n);
    }

}
