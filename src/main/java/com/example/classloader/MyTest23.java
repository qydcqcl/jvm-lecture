package com.example.classloader;

import sun.misc.Launcher;

/**
 * 在运行期,一个Java类是由该类的完全限定名(binary name, 二进制名)和用于加载该类的定义类加载器(defining loader)
 * 所共同决定的.如果同样名字(即相同的完全限定名)的类是由两个不同的加载器所加载,那么这些类就是不同的,即便
 * .class文件的字节码完全一样,并且从相同的位置加载亦如此
 * @author hzq
 * @date 2019/9/18 22:15
 */
public class MyTest23 {

    public static void main(String[] args) {
        System.out.println(System.getProperty("sun.boot.class.path"));
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println(System.getProperty("java.class.path"));

        /**
         * 内件于JVM中的启动类加载器会加载java.lang.ClassLoader以及其他Java平台类
         * 当JVM启动时,一块特殊的机器吗会运行,它会加载扩展类加载器于系统类加载器
         * 这块特殊的机器吗叫做启动类加载器(Bootstrap)
         *
         * 启动类加载器并不是Java类,而其它的加载器则都是Java类,启动类加载器时特定于平台的机器指令
         * 它负责开启整个加载过程
         *
         * 所有的类加载器(除了启动类加载器)都被实现为java类.不过,总归要有一个组件来加载第一个Java类加载器
         * 从而让猪呢个加载过程能够顺利进行下去,加载第一个纯Java类加载器就是启动类加载器的职责
         *
         * 启动类加载器还会加载工jre正常运行所需要的基本组件,这包括java.util和java.lang包中的类等等
         */

        System.out.println(ClassLoader.class.getClassLoader());

        // 扩展类加载器与系统类加载器也是有启动类加载器所加载
        System.out.println(Launcher.class.getClassLoader());
    }
}
