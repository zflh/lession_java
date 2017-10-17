package com.dashidan.lesson19;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇:  19.Java设计模式
 * 单例模式
 */
public class Demo1 {
    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton2 singleton2 = Singleton2.getInstance();
        Singleton3 singleton3 = Singleton3.getInstance();
        Singleton4 singleton4 = Singleton4.getInstance();
    }
}

/**
 * 懒汉式单例模式
 */
class Singleton1 {

    private static Singleton1 singleton1;

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        if (null == singleton1) {
            singleton1 = new Singleton1();
        }
        return singleton1;
    }
}

/**
 * 饿汉式单例模式
 */
class Singleton2 {

    private static Singleton2 singleton2 = new Singleton2();

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return singleton2;
    }
}

/**
 * 线程安全懒汉式单例模式
 */
class Singleton3 {

    private static Singleton3 singleton3;

    private Singleton3() {

    }

    public static synchronized Singleton3 getInstance() {
        if (null == singleton3) {
            singleton3 = new Singleton3();
        }
        return singleton3;
    }
}

/**
 * 内部类线程安全单例模式
 */
class Singleton4 {

    public static Singleton4 getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        public final static Singleton4 instance = new Singleton4();
    }
}




