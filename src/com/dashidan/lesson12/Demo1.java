package com.dashidan.lesson12;

/**
 * 大屎蛋教程网-dashidan.com
 * <p>
 * Java教程基础篇: 12.Java对象
 * 构造函数的执行
 */
public class Demo1 {

    public static void main(String args[]) {
        System.out.println("Demo1运行开始");
        TestStructure testStructure = new TestStructure(1, "大屎蛋教程网", "dashidan.com");
        int id = testStructure.getId();
        String url = testStructure.getUrl();
        String name = testStructure.getName();
        System.out.println("id " + id + " url " + url + " name " + name);
        System.out.println("运行完毕");
    }
}

/**
 * 测试构造方法类
 */
class TestStructure {
    private int id;
    private String name;
    private String url;

    /**
     * 构造函数
     */
    public TestStructure(int id, String name, String url) {
        /** 构造函数初始化成员变量*/
        System.out.println("执行TestStructure构造函数");
        this.id = id;
        this.name = name;
        this.url = url;
        System.out.println("id " + id + " name " + name + " url " + url);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
