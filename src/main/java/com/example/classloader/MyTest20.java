package com.example.classloader;

import java.lang.reflect.Method;

/**
 * @author hzq
 * @date 2019/9/17 22:46
 */
public class MyTest20 {

    public static void main(String[] args) throws Exception {
        MyTest16 loader1 = new MyTest16("loader1");
        MyTest16 loader2 = new MyTest16("loader2");

        Class<?> aClass = loader1.loadClass("com.example.classloader.MyPerson");
        Class<?> aClass1 = loader2.loadClass("com.example.classloader.MyPerson");

        System.out.println(aClass == aClass1);
        Object instance = aClass.newInstance();
        Object instance1 = aClass1.newInstance();

        Method setMyPerson = aClass.getMethod("setMyPerson", Object.class);
        setMyPerson.invoke(instance,instance1);

    }
}
