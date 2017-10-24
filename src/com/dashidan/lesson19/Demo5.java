package com.dashidan.lesson19;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇:  19.Java线程
 * 线程阻塞状态 同步阻塞
 */
public class Demo5 {
    public static Object lock = new Object();

    public static void main(String[] args) {
        SyncThread syncThread = new SyncThread("t1", lock);
        syncThread.start();

        SyncThread syncThread1 = new SyncThread("t2", lock);
        syncThread1.start();
    }
}

class SyncThread extends Thread {
    public Object lock;

    public SyncThread(String name, Object lock) {
        super(name);
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                /** 一个线程执行这个语句块的时候，另一个线程等待. */
                System.out.println(this.getName() + " before sleep.");
                Thread.sleep(3000);
                System.out.println(this.getName() + " after sleep.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
