package com.example.classloader;

/**
 * @author hzq
 * @date 2019/9/17 22:46
 */
public class MyPerson {

    private MyPerson myPerson;

    public void setMyPerson(Object object) {
        this.myPerson = (MyPerson) object;
    }
}
