package com.example.classloader;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author hzq
 * @date 2019/11/5 23:30
 */
public class MyTest27 {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytestdb", "root", "root");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
