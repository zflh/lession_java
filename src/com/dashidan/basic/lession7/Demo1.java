package com.dashidan.basic.lession7;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇: 7. Java方法
 */
public class Demo1 {
    public static void main(String[] args) {
        testFunc();
    }

    /**
     * 无返回值的方法
     */
    public static void testFunc() {
        int a = 1;
        int b = 2;
        /** 将a, b 传入相加的方法处理,将结果赋值给c, a + b = 3, 故执行完方法, c为3.*/
        int c = addInt(a, b);
        System.out.println(c);
    }

    /**
     * 传入2个值,参数按照顺序对应.上面方法的变量`a`,赋值给参数`p0`,变量`b`,赋值给参数`p1`.
     * 将这两个值相加,并将结果返回
     */
    public static int addInt(int p0, int p1) {
        return p0 + p1;
    }
}
