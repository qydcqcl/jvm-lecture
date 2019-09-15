package com.example.classloader;

/**
 * @author hzq
 * @date 2019/9/10 22:19
 */
public class MyTest7 {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("java.lang.String");
        System.out.println(clazz.getClassLoader());

        Class<?> clazz1 = Class.forName("com.example.classloader.C");
        System.out.println(clazz1.getClassLoader());
    }
}

class C {

}