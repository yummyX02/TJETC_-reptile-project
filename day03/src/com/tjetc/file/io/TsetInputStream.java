package com.tjetc.file.io;

import java.io.*;

public class TsetInputStream {
    /*
    FileInputStream
    文件字节输入流，万能的，任何类型均可读
    （1）read（）方法读取一字节数据，到文件末尾返回-1
    （2）read(byte[] t):一次最多读取t.length个字节，返回读取的数量
    注意在数组中第二次读的数据，将第一次读的数据覆盖，第一次没有覆盖的数据还在数组中。
    如果一个都没有读取到将返回-1。减少内存和硬盘的交互。可以利用String类的转换方法，将byte数组转换成String.

     */
    public static void main1(String[] args) throws IOException {
        File file = new File("D:/CS learning code/java/shixun/day03/src/com/tjetc/file/io/a.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        // 读到最后会返回-1
        int read  = fileInputStream.read();
        System.out.println((char) read);
    }

    public static void main(String[] args) throws IOException {
        File file = new File("D:/CS learning code/java/shixun/day03/src/com/tjetc/file/io/a.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bytes = new byte[1024];
        int len;
        while((len = fileInputStream.read(bytes)) != -1){
            // 通过String方法将bytes从0 到len 进行转换
            System.out.println(new String(bytes,0,len));
        }
    }
}
