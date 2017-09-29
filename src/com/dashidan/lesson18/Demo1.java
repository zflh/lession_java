package com.dashidan.lesson18;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇:  18.Java线程
 */
public class Demo1 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        /** t1 线程启动*/
        t1.start();
        MyThread2 myThread2 = new MyThread2();
        Thread t2 = new Thread(myThread2);
        /** t2 线程启动*/
        t2.start();
    }
}

class MyThread1 extends Thread {

    @Override
    public void run() {
        System.out.println("MyThread1 run.");
    }
}

class MyThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("MyThread2 run.");
    }
}

