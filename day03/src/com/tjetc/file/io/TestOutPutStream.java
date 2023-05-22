package com.tjetc.file.io;

import java.io.*;

public class TestOutPutStream{
    /*
    FileOutStream
        文件字节输出流，负责写。
        从内存到硬盘
        write（int b）方法。
            一般是两个语句一起用，将b1和b2之间的ASCII码对应的字符写入文件
        write(byte[] b)方法。
            将整个数组都写入
        write(byte[] b,int off,int len)方法。
        写入数组在off到len区间内的内容
     */
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("D:/CS learning code/java/shixun/day03/src/com/tjetc/file/io/b.txt");
        fileOutputStream.write(70);
        fileOutputStream.write(71);
        byte[] bytes = new byte[1024];
        byte[] bt = new byte[1024];
        String s = "我在研究IO流";
        bytes = s.getBytes();
        fileOutputStream.write(bytes);
        String ss = "Bye!See you tomorrow";
        bt = ss.getBytes();
        fileOutputStream.write(bt,0,3);
    }
}
