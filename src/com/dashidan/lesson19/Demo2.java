package com.dashidan.lesson19;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇:  19.Java设计模式
 * 工厂模式
 */
public class Demo2 {
    public static void main(String[] args) {
        /** 传入需要生产的产品类型*/
        Product product = Factory.getProduct(1);
        /** 打印产品信息*/
        product.info();
    }
}

/**
 * 工厂模式
 * 根据不同的类型，生产不同的产品
 */
class Factory {
    public static Product getProduct(int type) {
        switch (type) {
            case 1:
                return new Product1();
            case 2:
                return new Product2();
        }
        return null;
    }
}

/**
 * 产品的父类是抽象类，提供一个info方法
 */
abstract class Product {

    public abstract void info();
}

/**
 * 产品Product1继承自父类Product
 */
class Product1 extends Product {
    @Override
    public void info() {
        System.out.println("Product1 info.");
    }
}

/**
 * 产品Product2继承自父类Product
 */
class Product2 extends Product {
    @Override
    public void info() {
        System.out.println("Product2 info.");
    }
}
