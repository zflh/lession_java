package com.dashidan.lesson19;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇:  19.Java线程
 * synchronized锁方法和区块
 */
public class Demo7 {
    public static void main(String[] args) {
        SyncObject syncObject = new SyncObject();
        Demo7Thread t1 = new Demo7Thread("t1", syncObject);
        t1.start();
        Demo7Thread t2 = new Demo7Thread("t2", syncObject);
        t2.start();
    }
}

class SyncObject {

    /**
     * synchronized 锁方法
     */
    public synchronized void testSyncMethod(String name) {
        try {
            System.out.println(name + "运行testSyncMethod开始.");
            Thread.sleep(300);
            System.out.println(name + "运行testSyncMethod结束.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * synchronized 锁代码区块
     */
    public void testSyncCode(String name) {
        synchronized (this) {
            try {
                System.out.println(name + "运行testSyncCode开始.");
                Thread.sleep(300);
                System.out.println(name + "运行testSyncCode结束.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Demo7Thread extends Thread {
    SyncObject syncObject;

    public Demo7Thread(String name, SyncObject syncObject) {
        super(name);
        this.syncObject = syncObject;
    }

    @Override
    public void run() {
        syncObject.testSyncMethod(this.getName());
        syncObject.testSyncCode(this.getName());
    }
}

