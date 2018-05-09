package com.dashidan.lesson23;


/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇:  23.final关键字作用详解
 * final关键字应用场景  final关键字在构造函数中的作用
 */
public class Demo4 {

    public static void main(String[] args) {
        int a = 100;
        Test1 test1 = new Test1(a);
        a++;
        System.out.println("a " + a);
        System.out.println("n " + test1.getN());
    }
}

class Test1 {
    int n = 0;

    /**
     * 构造函数中传入的参数采用final修饰
     */
    public Test1(final int num) {
        this.n = num;
        /** 这里无法改变 num的值, 会报错 */
        // num = 2;
    }

    public int getN() {
        return n;
    }
}

