package com.dashidan.lession12;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇: 12.Java对象
 * 对象实例类型判断
 */
public class Demo12 {
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
