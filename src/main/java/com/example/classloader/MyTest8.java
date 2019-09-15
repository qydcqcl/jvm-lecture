package com.example.classloader;

import java.util.Random;

/**
 * @author hzq
 * @date 2019/9/10 22:29
 */
public class MyTest8 {

    public static void main(String[] args) {
        System.out.println(FinalTest.x);
    }
}

class FinalTest {
    public static final int x = new Random().nextInt(4);

    static {
        System.out.println("FinalTest static block");
    }
}
