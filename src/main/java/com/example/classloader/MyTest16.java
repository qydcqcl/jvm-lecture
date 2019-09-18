package com.example.classloader;

import java.io.*;

/**
 * @author hzq
 * @date 2019/9/15 15:38
 */
public class MyTest16 extends ClassLoader {

    private String path;

    private String classLoaderName;

    private final String fileExtension = ".class";

    public MyTest16(String classLoaderName) {
        // 将系统类加载器当做该类加载器的父加载器
        super();
        this.classLoaderName = classLoaderName;
    }

    public MyTest16(ClassLoader parent){
        super(parent);
    }

    public MyTest16(ClassLoader parent, String classLoaderName) {
        // 显示的指定该类加载器的父加载器
        super(parent);
        this.classLoaderName = classLoaderName;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "MyTest16{" +
                "classLoaderName='" + classLoaderName + '\'' +
                '}';
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        System.out.println("findClass执行了");
        System.out.println(this.classLoaderName);
        byte[] data = this.loadClassData(name);
        return this.defineClass(name, data,  0, data.length);
    }

    private byte[] loadClassData(String name) {
        InputStream is = null;
        byte[] data = null;
        ByteArrayOutputStream baos = null;

        try {
            name = name.replace(".", "\\");
            is = new FileInputStream(new File(this.path + name + this.fileExtension));
            baos = new ByteArrayOutputStream();

            int index = 0;
            while((index = is.read()) != -1){
                baos.write(index);
            }
            data = baos.toByteArray();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
                baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return data;
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        MyTest16 classLoader = new MyTest16("loader1");
//        classLoader.setPath("C:\\Users\\admin\\IdeaProjects\\jvm-lecture\\build\\classes\\java\\main\\");
        classLoader.setPath("C:\\My\\classFile\\");
        Class<?> aClass = classLoader.loadClass("com.example.classloader.MyTest1");
        System.out.println("class: " + aClass.hashCode());

        Object instance = aClass.newInstance();
        System.out.println(instance);
        System.out.println(instance.getClass().getClassLoader());


        MyTest16 loader2 = new MyTest16("loader2");
        loader2.setPath("C:\\My\\classFile\\");

        Class<?> aClass1 = loader2.loadClass("com.example.classloader.MyTest1");
        System.out.println("class: " + aClass1.hashCode());
        Object instance1 = aClass1.newInstance();
        System.out.println(instance1);
        System.out.println(instance1.getClass().getClassLoader());

    }

    public static void test(ClassLoader classLoader) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> aClass = classLoader.loadClass("com.example.classloader.MyTest1");
        Object instance = aClass.newInstance();
        System.out.println(instance);
        System.out.println(instance.getClass().getClassLoader());

    }
}
