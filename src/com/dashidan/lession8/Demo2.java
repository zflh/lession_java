package com.dashidan.lession8;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇:8. Java流程控制
 * 基础switch case
 */
public class Demo2 {

    public static void main(String[] args) {
        int num = 2;
        baseSwitch(num);
    }

    /**
     * switch case基本模型
     *
     * @param var 传入的参数，通过该参数找到case对应的值,执行对应的代码.
     */
    public static void baseSwitch(int var) {
        switch (var) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("default : " + var);
                break;
        }
        System.out.println("switch over.");
    }
}
