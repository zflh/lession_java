package com.dashidan.promote.lession5;

/**
 * 大屎蛋教程网-dashidan.com
 *
 * Java教程进阶篇: 5.Java对象(4)：封装
 */
public class Demo1 {
    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.setName("哈拆迁");
        /** 通过公开接口访问Pet的私有属性name*/
        System.out.println(pet.getName());
    }
}
