package com.example.classloader;

/**
 * @author hzq
 * @date 2019/9/16 22:28
 */
public class MyCat {

    public MyCat() {
        System.out.println("MyCat is loaded by: " + this.getClass().getClassLoader());
        System.out.println("from MySample: " + MySample.class);
    }
}
