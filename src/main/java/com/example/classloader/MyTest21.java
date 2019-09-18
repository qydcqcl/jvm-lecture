package com.example.classloader;

import java.lang.reflect.Method;

/**
 * 类加载的双亲委托模型的好处:
 * 1. 可以确保Java核心库的类型安全: 所有的Java应用都至少会引用java.lang.Object类,也就是说在运行期,java.lang.Object这个类
 * 会被加载到Java虚拟机中;如果这个加载过程是由Java应用自己的类加载器所完成的,那么很可能就会在JVM中存在多个版本的java.lang.Object
 * 类,而且这些类之间还是不兼容的,相互不可见的.(正是命名空间在发挥作用)借助于双亲委托机制,Java核心类库中的类的加载工作都是由启动类加载器
 * 来统一完成,从而确保了java应用所使用的都是同一个版本的Java核心类库,他们之间是相互兼容的
 * 2. 可以确保Java核心类库所提供的类不会被自定义的类所替换
 * 3. 不同的类加载器可以为相同名称(binary name)的类创建额外的命名空间.相同名称的类可以并存在Java虚拟机中,只需用不同的类加载器来
 * 加载他们即可. 不同类加载器所加载的类之间是不兼容的,这就相当于在Java虚拟机内部创建了一个又一个相互隔离的Java类空间,这类技术在很多
 * 框架中都得到了实际应用
 * @author hzq
 * @date 2019/9/17 23:10
 */
public class MyTest21 {

    public static void main(String[] args) throws Exception {
        MyTest16 loader1 = new MyTest16("loader1");
        MyTest16 loader2 = new MyTest16("loader2");

        loader1.setPath("C:\\My\\classFile\\");
        loader2.setPath("C:\\My\\classFile\\");

        Class<?> aClass = loader1.loadClass("com.example.classloader.MyPerson");
        Class<?> aClass1 = loader2.loadClass("com.example.classloader.MyPerson");

        System.out.println(aClass == aClass1);
        Object instance = aClass.newInstance();
        Object instance1 = aClass1.newInstance();

        Method setMyPerson = aClass.getMethod("setMyPerson", Object.class);
        setMyPerson.invoke(instance,instance1);

    }
}
