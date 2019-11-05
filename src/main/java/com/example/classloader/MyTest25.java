package com.example.classloader;

/**
 * @author hzq
 * @date 2019/11/5 22:27
 */
public class MyTest25 implements Runnable {

    private Thread thread;

    public MyTest25() {
        this.thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        ClassLoader classLoader = this.thread.getContextClassLoader();
        this.thread.setContextClassLoader(classLoader);
        System.out.println("class: " + classLoader.getClass());
        System.out.println("parent: " + classLoader.getParent().getClass());
    }

    public static void main(String[] args) {
        new MyTest25();
    }
}
