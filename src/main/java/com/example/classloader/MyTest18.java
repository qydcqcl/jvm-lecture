package com.example.classloader;

/**
 * @author hzq
 * @date 2019/9/17 22:32
 */
public class MyTest18 {

    public static void main(String[] args) {
        System.out.println(System.getProperty("sun.boot.class.path"));
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println(System.getProperty("java.class.path"));
    }
}
