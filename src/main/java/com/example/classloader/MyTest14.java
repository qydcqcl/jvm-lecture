package com.example.classloader;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 * @author hzq
 * @date 2019/9/13 16:20
 */
public class MyTest14 {

    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String resourceName = "com/example/classloader/MyTest13.class";

        Enumeration<URL> resources = classLoader.getResources(resourceName);
        while (resources.hasMoreElements()) {
            URL url = resources.nextElement();
            System.out.println(url);
        }
        System.out.println("-------------------------");

        Class<?> aClass = String.class;
        System.out.println(aClass.getClassLoader());
    }
}
