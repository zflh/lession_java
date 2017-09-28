package com.dashidan.lesson12;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇: 12.Java对象
 * 对象向上转型和向下转型
 */
public class Demo13 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        /**
         * testUpcasting 需要传入父类Pet实例，这里传入的是子类cat实例的引用
         * 自动向上转型
         * 由于子类Cat覆写了父类的cat()方法，执行子类的eat()方法
         */
        testUpCasting(cat);


        /** 父类对象的引用，指向子类实例*/
        Pet pet = new Cat();
        /**
         * testUpcasting 需要传入父类Pet实例，这里传入的是父类Pet的引用
         * 强制向下转型
         * 由于子类Cat覆写了父类的cat()方法，执行子类的eat()方法
         */
        testDownCasting((Cat) pet);
    }

    /**
     * 测试向上转型
     */
    public static void testUpCasting(Pet pet) {
        pet.eat();
    }

    /**
     * 测试向下转型
     */
    public static void testDownCasting(Cat pet) {
        pet.eat();
    }
}
