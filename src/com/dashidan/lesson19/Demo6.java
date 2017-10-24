package com.dashidan.lesson19;


/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇:  19.Java线程
 * 线程死锁
 */
public class Demo6 {

    public static LockObject lockA = new LockObject("LOCK-A");
    public static LockObject lockB = new LockObject("LOCK-B");

    public static void main(String[] args) {
        /** 注意这两个线程传入的参数，顺序不一样, lockA, lockB*/
        LockThread thread1 = new LockThread("t1", lockA, lockB);
        thread1.start();
        /** 注意这两个线程传入的参数，顺序不一样, lockB, lockA*/
        LockThread thread2 = new LockThread("t2", lockB, lockA);
        thread2.start();
    }
}

class LockThread extends Thread {

    LockObject lock0;
    LockObject lock1;

    public LockThread(String name, LockObject lock0, LockObject lock1) {
        super(name);
        this.lock0 = lock0;
        this.lock1 = lock1;
    }

    @Override
    public void run() {
        try {
            synchronized (lock0) {
                System.out.println(getName() + "持有对象锁 " + lock0.getName());
                Thread.sleep(3000);
                System.out.println(getName() + "等待对象锁 " + lock1.getName() + " ... ");
                synchronized (lock1) {
                    System.out.println(getName() + "持有对象锁 " + lock1.getName());
                    Thread.sleep(3000);
                }
                /** Attention！这一行并没有输出*/
                System.out.println(getName() + "执行完毕");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

/**
 * 一个简单的锁对象
 */
class LockObject {
    /**
     * 对象名字
     */
    private String name;

    public LockObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
