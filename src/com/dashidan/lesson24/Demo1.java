package com.dashidan.lesson24;

import java.io.*;

/**
 * 大屎蛋教程网-dashidan.com
 * Java教程基础篇:  24.transient关键字详解
 * 2018/5/26
 */
public class Demo1 {

    static int id = 100;
    static String name = "大屎蛋";
    static String url = "http://dashidan.com";
    static String weather = "晴朗";

    public static void main(String[] args) {

        /** 创建测试对象*/
        TestObject testObject = new TestObject(id, name, url, weather);
        try {
            /** 将对象序列化，输出到byte[]中*/
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream outputStream = new ObjectOutputStream(byteArrayOutputStream);
            outputStream.writeObject(testObject);
            outputStream.close();
            byte[] bytes = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();

            /** 将byte[]字节反序列化，转化为对象*/
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            ObjectInputStream inputStream = new ObjectInputStream(byteArrayInputStream);
            TestObject obj = (TestObject) inputStream.readObject();
            inputStream.close();
            byteArrayInputStream.close();

            /** 输出运行结果*/
            System.out.println(obj.getId());
            System.out.println(obj.getName());
            System.out.println(obj.getUrl());
            System.out.println(obj.getWeather());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


/**
 * 实现Serializable接口的测试类，其中weather属性被定义transient
 */
class TestObject implements Serializable {

    int id;
    String name;
    String url;
     String weather;

    public TestObject(int id, String name, String url, String weather) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.weather = weather;
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

    public String getWeather() {
        return weather;
    }
}
