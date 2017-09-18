package com.dashidan.basic.lession17;

/**
 * 大屎蛋教程网-dashidan.com
 *
 * Java教程基础篇: 17.Java流程控制(2)：switch,case,break,default
 * Demo2: 测试case没有break的情况
 */
public class Demo2 {

    public static void main(String[] args) {
        int num = 2;
        testSwitchWithoutBreak(num);
    }

    /**
     * 测试case没有break的情况
     *
     * @param var 传入的case参数
     */
    public static void testSwitchWithoutBreak(int var) {
        switch (var) {
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println(4);
                break;
        }
        System.out.println("switch over.");
    }
}
