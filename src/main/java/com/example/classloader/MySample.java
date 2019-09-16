package com.example.classloader;

/**
 * 关于命名空间的重要说明
 * 子加载器所加载的类能够访问到父加载器所加载的类
 * 父加载器所加载的类无法访问到子加载器所加载的类
 * @author hzq
 * @date 2019/9/16 22:29
 */
public class MySample {

    public MySample() {
        System.out.println("MySample is loaded by: " + this.getClass().getClassLoader());
        new MyCat();
        System.out.println("from MyCat:" + MyCat.class);
    }
}
