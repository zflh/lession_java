package com.dashidan.lesson19;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇:  19.Java线程
 * 线程阻塞状态  获得同步锁, wait(), notifyAll()
 */
public class Demo3 {

    public static Object object = new Object();

    public static void main(String[] args) {
        WaitThread waitThread = new WaitThread(object);
        waitThread.start();

        try {
            /** 主线程休眠3秒*/
            System.out.println("主线程休眠3秒");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /** 3秒后执行 notifyAll */
        synchronized (object) {
            object.notifyAll();
        }
    }
}

class WaitThread extends Thread {
    Object object;

    public WaitThread(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        System.out.println("WaitThread run.");
        synchronized (object) {
            try {
                System.out.println("WaitThread before lock " + this.getName());
                object.wait();
                System.out.println("WaitThread after lock " + this.getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


