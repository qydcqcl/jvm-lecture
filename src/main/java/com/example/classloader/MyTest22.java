package com.example.classloader;

/**
 * @author hzq
 * @date 2019/9/18 22:01
 */
public class MyTest22 {

    static {
        System.out.println("MyTest22 init");
    }

    public static void main(String[] args) {
        System.out.println(MyTest22.class.getClassLoader());
        System.out.println(MyTest1.class.getClassLoader());
    }
}
