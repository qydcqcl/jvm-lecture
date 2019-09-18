package com.example.classloader;

import com.sun.crypto.provider.AESKeyGenerator;

/**
 * @author hzq
 * @date 2019/9/17 22:44
 */
public class MyTest19 {

    public static void main(String[] args) {
        AESKeyGenerator aesKeyGenerator = new AESKeyGenerator();

        System.out.println(aesKeyGenerator.getClass().getClassLoader());
        System.out.println(MyTest19.class.getClassLoader());
    }
}
