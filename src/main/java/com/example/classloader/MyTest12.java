package com.example.classloader;

/**
 * 调用ClassLoader类的loadClass方法加载一个类,并不是对类的主动使用,不会导致类的初始化
 * @author hzq
 * @date 2019/9/10 22:54
 */
public class MyTest12 {

    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        Class<?> aClass = classLoader.loadClass("com.example.classloader.Cl");

        System.out.println(aClass);
        System.out.println("------------");

        aClass = Class.forName("com.example.classloader.Cl");
        System.out.println(aClass);
    }
}

class Cl {

    static {
        System.out.println("Class Cl");
    }
}
