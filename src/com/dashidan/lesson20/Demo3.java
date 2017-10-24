package com.dashidan.lesson20;


import java.util.ArrayList;

/**
 * 观察者接口
 */
interface IObserver {
    void action();
}

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇:  20.Java设计模式
 * 观察者模式
 */
public class Demo3 {
    public static void main(String[] args) {
        /** 初始化发布者和观察者*/
        Publisher publisher = new Publisher();
        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();
        /** 加入2个观察者到发布者的消息侦听队列*/
        publisher.addObserver(observer1);
        publisher.addObserver(observer2);
        /** 通知观察者*/
        publisher.notifyAllObserver();
    }
}

/**
 * 发布者
 */
class Publisher {

    /**
     * 发布者的消息侦听队列
     */
    ArrayList<IObserver> observers = new ArrayList<>();

    /**
     * 加入消息侦听队列
     */
    public void addObserver(IObserver iObserver) {
        System.out.println("加入观察者");
        observers.add(iObserver);
    }

    /**
     * 通知侦听队列中所有的观察者
     */
    public void notifyAllObserver() {
        for (IObserver iObserver : observers) {
            System.out.println("通知观察者");
            iObserver.action();
        }
    }
}

/**
 * 观察者Observer1类
 */
class Observer1 implements IObserver {
    @Override
    public void action() {
        System.out.println("Observer1 action.");
    }
}

/**
 * 观察者Observer2类
 */
class Observer2 implements IObserver {
    @Override
    public void action() {
        System.out.println("Observer2 action.");
    }
}


