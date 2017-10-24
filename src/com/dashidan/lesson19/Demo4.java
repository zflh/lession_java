package com.dashidan.lesson19;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇:  19.Java线程
 * 线程阻塞状态 sleep()
 */
public class Demo4 {
    public static void main(String[] args) {
        SleepThread thread = new SleepThread();
        thread.start();
    }
}

class SleepThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("before sleep.");
            /** 休眠3秒*/
            Thread.sleep(3000);
            /** 3秒后输出*/
            System.out.println("after sleep.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
