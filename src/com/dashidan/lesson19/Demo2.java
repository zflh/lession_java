package com.dashidan.lesson19;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇:  19.Java线程
 * 线程阻塞状态-wait(), 报错线程
 */
public class Demo2 {
    public static void main(String[] args) {
        WaitThread1 waitThread1 = new WaitThread1();
        waitThread1.start();
    }
}

class WaitThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("WaitThread run.");
        try {
            System.out.println("WaitThread before wait.");
            this.wait();
            System.out.println("WaitThread after wait.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

