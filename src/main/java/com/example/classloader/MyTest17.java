package com.example.classloader;

/**
 * @author hzq
 * @date 2019/9/16 22:33
 */
public class MyTest17 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        MyTest16 loader1 = new MyTest16("loader1");
        Class<?> aClass = loader1.loadClass("com.example.classloader.MySample");
        System.out.println("class: " + aClass.hashCode());

        // 如果注释掉该行, 那么并不会实例化MySample对象,即MySample构成方法就不会被调用
        // 因此不会实例化MyCat对象,即没有MyCat进行主动使用,这里就不会加重MyCat
        Object instance = aClass.newInstance();
    }
}
