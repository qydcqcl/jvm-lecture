package com.example.classloader;

/**
 * @author hzq
 * @date 2019/9/17 22:35
 */
public class MyTest18_1 {

    public static void main(String[] args) throws ClassNotFoundException {
        MyTest16 loader1 = new MyTest16("loader1");
        loader1.setPath("C:\\My\\classFile\\");

        Class<?> aClass = loader1.loadClass("com.example.classloader.MyTest1");
        System.out.println("class: " + aClass.hashCode());
        System.out.println("classloader:" + aClass.getClassLoader());
    }
}
