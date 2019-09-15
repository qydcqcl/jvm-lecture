package com.example.classloader;

/**
 * @author hzq
 * @date 2019/9/10 22:32
 */
public class MyTest9 {

    static {
        System.out.println("MyTest9 static block");
    }

    public static void main(String[] args) {
        System.out.println(Child.a);
    }
}

class Parent {
    static int b = 3;

    static {
        System.out.println("Parent static block");
    }
}

class Child extends Parent {
    static int a = 2;

    static {
        System.out.println("Child static block");
    }
}
