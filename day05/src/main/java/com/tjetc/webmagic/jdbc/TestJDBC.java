package com.tjetc.webmagic.jdbc;

import com.tjetc.webmagic.MovieInfo;

import java.net.ConnectException;
import java.sql.*;
import java.util.ArrayList;

public class TestJDBC {
//    保存数据到数据库
    public void save(MovieInfo movieInfo) throws SQLException, ClassNotFoundException {
        //        1.注册驱动 mysql5.5版本以后，会自动找到驱动，不用自己书写
        Class.forName("com.mysql.jdbc.Driver");
//        2.获取链接
//        链接地址
        String url = "jdbc:mysql://127.0.0.1:3306/shixundb";
//        链接用户名
        String username = "root";
//        链接用户密码
        String password = "root123456";
//        获取连接
        Connection connection = DriverManager.getConnection(url,username,password);

        String sql = "INSERT INTO student (name) VALUES(?);";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, movieInfo.getName());

        int i = statement.executeUpdate();
        System.out.println(i);
    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        1.注册驱动 mysql5.5版本以后，会自动找到驱动，不用自己书写
        Class.forName("com.mysql.jdbc.Driver");
//        2.获取链接
//        链接地址
        String url = "jdbc:mysql://127.0.0.1:3306/shixundb";
//        链接用户名
        String username = "root";
//        链接用户密码
        String password = "root123456";
//        获取连接
        Connection connection = DriverManager.getConnection(url,username,password);
//        System.out.println(connection);
//        String sql = "select * from student";
//        PreparedStatement statement = connection.prepareStatement(sql);
//        ResultSet resultSet = statement.executeQuery();
//        ArrayList<String> arrayList = new ArrayList<>();
//        while(resultSet.next()) {
//            String name = resultSet.getString("name");
////            System.out.println(name);
//            arrayList.add(name);
//        }
//        for (String s : arrayList) {
//            System.out.println(s);
//        }
        String sql = "INSERT INTO student (name,age,sex,address,math,english) VALUES(?,?,?,?,?,?);";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,"zhangsan");
        statement.setInt(2,11);
        statement.setString(3,"nan");
        statement.setString(4,"tianjin");
        statement.setInt(5,99);
        statement.setInt(6,100);
        int i = statement.executeUpdate();
        System.out.println(i);
    }

}
