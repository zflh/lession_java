package com.dashidan.lesson18;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇:  18.Java线程
 * Lock对象
 */
public class Demo8 {

    public static void main(String[] args) {
        LockObjectReadAndWrite lockObj = new LockObjectReadAndWrite();
        /*写线程*/
        WriteThread writeThread = new WriteThread("w1", lockObj);
        writeThread.start();
        /*读线程*/
        ReadThread readThread = new ReadThread("r1", lockObj);
        readThread.start();
    }
}


class LockObjectReadAndWrite {

    private final Map<String, Integer> m = new HashMap<>();
    private final ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
    private final Lock readLock = rwl.readLock();
    private final Lock writeLock = rwl.writeLock();

    public Integer get(String key, String threadName) {
        System.out.println("加入读锁 " + threadName);
        readLock.lock();
        try {
            System.out.println("读取休息1秒");
            Thread.sleep(1000);
            return m.get(key);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return -1;
        } finally {
            readLock.unlock();
            System.out.println("释放读锁 " + threadName);
        }
    }

    public Integer put(String key, Integer value, String threadName) {
        System.out.println("------WriteThread 加入写锁------ : " + threadName);
        writeLock.lock();
        try {
            System.out.println("写入休息6秒.....");
            Thread.sleep(6000);
            return m.put(key, value);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return -1;
        } finally {
            writeLock.unlock();
            System.out.println("------WriteThread 释放写锁------: " + threadName);
        }
    }
}

class WriteThread extends Thread {

    LockObjectReadAndWrite lockObj;

    public WriteThread(String name, LockObjectReadAndWrite lockObj) {
        super(name);
        this.lockObj = lockObj;
    }

    @Override
    public void run() {
        while (true) {
            /*持续写入*/
            lockObj.put("a", 1, this.getName());
            /*写入线程休息3秒*/
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class ReadThread extends Thread {

    LockObjectReadAndWrite lockObj;

    public ReadThread(String name, LockObjectReadAndWrite lockObj) {
        super(name);
        this.lockObj = lockObj;
    }

    @Override
    public void run() {
        while (true) {
            /*持续读取*/
            lockObj.get("a", this.getName());
        }
    }
}