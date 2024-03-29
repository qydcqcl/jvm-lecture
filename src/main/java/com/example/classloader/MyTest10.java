package com.example.classloader;

/**
 * @author hzq
 * @date 2019/9/10 22:38
 */
public class MyTest10 {

    static {
        System.out.println("MyTest10 static block");
    }

    public static void main(String[] args) {
        Parent2 parent2;
        System.out.println("-----------");
        parent2 = new Parent2();
        System.out.println("-----------");
        System.out.println(parent2.a);
        System.out.println("------------");
        System.out.println(Child2.b);
    }
}


class Parent2 {

    static int a = 2;

    static {
        System.out.println("Parent2 static block");
    }
}

class Child2 {
    static int b = 4;

    static {
        System.out.println("Child2 static block");
    }
}