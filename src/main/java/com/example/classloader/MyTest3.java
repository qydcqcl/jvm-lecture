package com.example.classloader;

import java.util.UUID;

/**
 * 当一个常量的值并非编译期间可以确定的,那么其值就不会被调用类的常量池中
 * 这时在程序运行时秒回导致主动使用这个常量所在类,显然会导致这个类被初始化
 * @author hzq
 * @date 2019/9/5 22:42
 */
public class MyTest3 {

    public static void main(String[] args) {
        System.out.println(MyParent3.str);
    }
}

class MyParent3 {

    public static final String str = UUID.randomUUID().toString();

    static {
        System.out.println("Myparent static code");
    }
}
