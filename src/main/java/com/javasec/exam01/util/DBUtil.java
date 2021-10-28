package com.javasec.exam01.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static final String URL="jdbc:mysql://127.0.0.1:3306/smartschool";
    private static final String USER="root";
    private static final String PASSWORD ="root";
    private static Connection connection=null;
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // 获取数据库连接
            connection= DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("连接成功");
        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    // 返回数据库连接
    public static Connection getConnection(){
        return connection;
    }

}
