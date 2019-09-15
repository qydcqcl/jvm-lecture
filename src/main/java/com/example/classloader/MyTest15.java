package com.example.classloader;

/**
 * @author hzq
 * @date 2019/9/15 15:13
 */
public class MyTest15 {

    public static void main(String[] args) {
        String[] strings = new String[2];
        System.out.println(strings.getClass().getClassLoader());

        System.out.println("------------------------------");

        MyTest15[] myTest15s = new MyTest15[2];
        System.out.println(myTest15s.getClass().getClassLoader());
    }
}
