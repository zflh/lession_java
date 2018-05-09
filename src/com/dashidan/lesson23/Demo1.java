package com.dashidan.lesson23;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇:  .final关键字作用详解
 * final关键字应用场景 单例模式
 */
public class Demo1 {

    public static Demo1 getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        public final static Demo1 instance = new Demo1();
    }
}
