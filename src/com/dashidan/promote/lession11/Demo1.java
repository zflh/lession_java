package com.dashidan.promote.lession11;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程进阶篇: 11.Java对象(10)：对象实例类型判断：instanceof
 */
public class Demo1 {
    public static void main(String[] args) {
        Pet pet = new Pet();
        boolean isInstance = pet instanceof Pet;
        System.out.println("pet instanceof Pet: " + isInstance);
        Cat cat = new Cat();
        /** 子类也属于父类的一个实例*/
        isInstance = cat instanceof Pet;
        System.out.println("cat instanceof Pet: " + isInstance);
    }
}
