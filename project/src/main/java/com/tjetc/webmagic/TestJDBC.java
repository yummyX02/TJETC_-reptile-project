package com.tjetc.webmagic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestJDBC {
    public void save(NovelInfo novelInfo) throws SQLException, ClassNotFoundException {
        Class.forName("");
        String url = "";
        String user = "root";
        String password = "";
        Connection connection = DriverManager.getConnection(url,user,password);
        String sql = "INSERT INTO bookInfo(id,bookName,writerName,type,star,info,writerStatus,fontNum,thumbup,updateInfo) VALUES(?,?,?,?,?,?,?,?,?,?);";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1,novelInfo.getId());
        statement.setString(2,novelInfo.getBookName());
        statement.setString(3,novelInfo.getWriterName());
        statement.setString(4,novelInfo.getType());
        statement.setString(5,novelInfo.getStar());
        statement.setString(6,novelInfo.getInfo());
        statement.setString(7,novelInfo.getStatus());
        statement.setString(8,novelInfo.getFontNum());
        statement.setString(9,novelInfo.getThumbUp());
        statement.setString(10,novelInfo.getUpdateInfo());
        int i = statement.executeUpdate();
        System.out.println(i);
    }
}
