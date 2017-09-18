package com.dashidan.basic.lession17;

/**
 * 大屎蛋教程网-dashidan.com
 *
 * Java教程基础篇: 17.Java流程控制(2)：switch,case,break,default
 * Demo2: 测试switch case参数为字符串
 */
public class Demo3 {

    public static void main(String[] args) {
        String str = "a";
        testSwitchCaseString(str);
    }

    /**
     * 测试switch case参数为字符串
     *
     * @param var 传入的case字符串
     */
    public static void testSwitchCaseString(String var) {
        switch (var) {
            case "a":
                System.out.println("a");
                break;
            case "b":
                System.out.println("b");
                break;
            case "c":
                System.out.println("c");
                break;
            default:
                System.out.println("default");
                break;
        }
        System.out.println("switch over.");
    }
}
