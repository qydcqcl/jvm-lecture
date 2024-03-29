package com.example.classloader;

/**
 * 对于数组实例来说,其类型是由jvm在运行期间动态生成的,表示为[Lcom.example.classloader.MyParent4
 * 这种形式.动态生成的类型,其父类型就是Object
 *
 * 对于数组来说,JavaDoc经常将构成数组的元素为Component,实际上就是讲数组降低一个维度厚度的类型
 *
 * 助记词:
 * anewarray: 表示创建一个引用类型的(如类,接口,数组) 数组,并将其引用值压入栈顶
 * newarray: 表示一个指定的原始类型(如int,float,char等)数组,并将其引用压入栈顶
 *
 * @author hzq
 * @date 2019/9/5 22:58
 */
public class MyTest4 {

    public static void main(String[] args) {
//        MyParent4 myParent4 = new MyParent4();
//        System.out.println("===================");
//        MyParent4 myParent5 = new MyParent4();
        MyParent4[] myParent4s = new MyParent4[1];
        System.out.println(myParent4s.getClass());

        MyParent4[][] myParent4s1 = new MyParent4[1][1];
        System.out.println(myParent4s1.getClass());

        System.out.println(myParent4s.getClass().getSuperclass());
        System.out.println(myParent4s1.getClass().getSuperclass());

        int[] ints = new int[1];
        System.out.println(ints.getClass());
        System.out.println(ints.getClass().getSuperclass());

        char[] chars = new char[1];
        System.out.println(chars.getClass());

        boolean[] booleans = new boolean[1];
        System.out.println(booleans.getClass());

        short[] shorts = new short[1];
        System.out.println(shorts.getClass());

        byte[] bytes = new byte[1];
        System.out.println(bytes.getClass());
    }
}

class MyParent4 {

    static {
        System.out.println("MyParent4 statci block");
    }
}
